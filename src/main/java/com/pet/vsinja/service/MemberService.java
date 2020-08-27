package com.pet.vsinja.service;

import java.util.List;

import com.pet.vsinja.domain.MemberDomain;
import com.pet.vsinja.mapper.MemberMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    
    @Autowired
    public MemberMapper memberMapper;

    public List<MemberDomain> selectMember(final Long idx) throws Exception {
        return memberMapper.selectMember(idx);
    }
}