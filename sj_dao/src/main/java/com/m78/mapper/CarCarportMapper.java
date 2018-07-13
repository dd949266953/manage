package com.m78.mapper;

import com.m78.entity.CarCarport;

public interface CarCarportMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CarCarport record);

    int insertSelective(CarCarport record);

    CarCarport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CarCarport record);

    int updateByPrimaryKey(CarCarport record);
}