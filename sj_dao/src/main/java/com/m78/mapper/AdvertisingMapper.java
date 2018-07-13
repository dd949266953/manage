package com.m78.mapper;

import com.m78.entity.Advertising;

public interface AdvertisingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Advertising record);

    int insertSelective(Advertising record);

    Advertising selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Advertising record);

    int updateByPrimaryKey(Advertising record);
}