package com.m78.mapper;

import com.m78.entity.HouseTentment;

public interface HouseTentmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HouseTentment record);

    int insertSelective(HouseTentment record);

    HouseTentment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HouseTentment record);

    int updateByPrimaryKey(HouseTentment record);
}