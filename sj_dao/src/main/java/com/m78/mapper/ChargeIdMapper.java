package com.m78.mapper;

import com.m78.entity.ChargeId;

public interface ChargeIdMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ChargeId record);

    int insertSelective(ChargeId record);

    ChargeId selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ChargeId record);

    int updateByPrimaryKey(ChargeId record);
}