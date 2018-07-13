package com.m78.mapper;

import com.m78.entity.VoteOption;

public interface VoteOptionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VoteOption record);

    int insertSelective(VoteOption record);

    VoteOption selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VoteOption record);

    int updateByPrimaryKey(VoteOption record);
}