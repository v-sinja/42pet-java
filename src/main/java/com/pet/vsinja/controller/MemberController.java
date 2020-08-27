package com.pet.vsinja.controller;

import java.util.List;

import com.pet.vsinja.domain.MemberDomain;
import com.pet.vsinja.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/spring") 
    @ResponseBody 
    public String index() { 
        return "Hello, Spring~~1"; 
    }

    @RequestMapping("/test")
    @ResponseBody 
    public List<MemberDomain> test() throws Exception {
        long idx = 1;
        return memberService.selectMember(idx);
    }
}