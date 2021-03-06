package com.pet.vsinja.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.pet.vsinja.domain.UserDomain;

@Mapper
@Repository
public interface UserMapper {
    public UserDomain GetUser(String id, String password) throws Exception;

    public UserDomain FindByEmail(String id);
}
