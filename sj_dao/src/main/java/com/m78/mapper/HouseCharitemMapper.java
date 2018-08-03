package com.m78.mapper;

import com.m78.entity.HouseCharitem;

public interface HouseCharitemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HouseCharitem record);

    int insertSelective(HouseCharitem record);

    HouseCharitem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HouseCharitem record);

    int updateByPrimaryKey(HouseCharitem record);
}