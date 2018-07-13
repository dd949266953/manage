package com.m78.mapper;

import com.m78.entity.VoteTentment;

public interface VoteTentmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VoteTentment record);

    int insertSelective(VoteTentment record);

    VoteTentment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VoteTentment record);

    int updateByPrimaryKey(VoteTentment record);
}