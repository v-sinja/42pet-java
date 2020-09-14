package com.pet.vsinja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/sign-in")
public class SignInController {

    //
    @GetMapping("tst")
    public String test() {
        return "test";
    }
}
