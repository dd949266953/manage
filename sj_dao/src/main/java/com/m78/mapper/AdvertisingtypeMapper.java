package com.m78.mapper;

import com.m78.entity.Advertisingtype;

public interface AdvertisingtypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Advertisingtype record);

    int insertSelective(Advertisingtype record);

    Advertisingtype selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Advertisingtype record);

    int updateByPrimaryKey(Advertisingtype record);
}