package com.m78.mapper;

import com.m78.entity.Talk;

public interface TalkMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Talk record);

    int insertSelective(Talk record);

    Talk selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Talk record);

    int updateByPrimaryKey(Talk record);
}