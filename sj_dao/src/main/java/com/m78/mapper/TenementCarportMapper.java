package com.m78.mapper;

import com.m78.entity.TenementCarport;

public interface TenementCarportMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TenementCarport record);

    int insertSelective(TenementCarport record);

    TenementCarport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TenementCarport record);

    int updateByPrimaryKey(TenementCarport record);
}