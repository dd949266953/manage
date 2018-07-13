package com.m78.mapper;

import com.m78.entity.AdvertisingCommunity;

public interface AdvertisingCommunityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdvertisingCommunity record);

    int insertSelective(AdvertisingCommunity record);

    AdvertisingCommunity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdvertisingCommunity record);

    int updateByPrimaryKey(AdvertisingCommunity record);
}