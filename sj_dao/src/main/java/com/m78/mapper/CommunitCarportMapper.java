package com.m78.mapper;

import com.m78.entity.CommunitCarport;

public interface CommunitCarportMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommunitCarport record);

    int insertSelective(CommunitCarport record);

    CommunitCarport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommunitCarport record);

    int updateByPrimaryKey(CommunitCarport record);
}