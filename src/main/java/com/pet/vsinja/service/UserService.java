package com.pet.vsinja.service;

import com.pet.vsinja.domain.UserDomain;
import com.pet.vsinja.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    public UserMapper userMapper;

    public UserDomain GetUser(String id, String password) throws Exception {
        return userMapper.GetUser(id, password);
    }
}
