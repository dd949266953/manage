package com.m78.mapper;

import com.m78.entity.Chargeitem;

public interface ChargeitemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Chargeitem record);

    int insertSelective(Chargeitem record);

    Chargeitem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Chargeitem record);

    int updateByPrimaryKey(Chargeitem record);
}