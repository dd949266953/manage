package com.m78.mapper;

import com.m78.entity.TenementCar;

public interface TenementCarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TenementCar record);

    int insertSelective(TenementCar record);

    TenementCar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TenementCar record);

    int updateByPrimaryKey(TenementCar record);
}