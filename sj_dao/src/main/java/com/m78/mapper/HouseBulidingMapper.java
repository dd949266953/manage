package com.m78.mapper;

import com.m78.entity.HouseBuliding;

public interface HouseBulidingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HouseBuliding record);

    int insertSelective(HouseBuliding record);

    HouseBuliding selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HouseBuliding record);

    int updateByPrimaryKey(HouseBuliding record);
}