package com.pet.vsinja.service;

import com.pet.vsinja.domain.UserDomain;
import com.pet.vsinja.mapper.UserMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomUserDetailService implements UserDetailsService {

    private UserMapper user;

    @Override
    public UserDetails loadUserByUsername(String username) {
        return user.FindByEmail(username);
    }
}
