package com.pet.vsinja.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.pet.vsinja.domain.MemberDomain;

@Mapper
@Repository
public interface MemberMapper {
    public List<MemberDomain> selectMember(Long idx) throws Exception;
}