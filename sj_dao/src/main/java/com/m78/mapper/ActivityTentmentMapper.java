package com.m78.mapper;

import com.m78.entity.ActivityTentment;

public interface ActivityTentmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivityTentment record);

    int insertSelective(ActivityTentment record);

    ActivityTentment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivityTentment record);

    int updateByPrimaryKey(ActivityTentment record);
}