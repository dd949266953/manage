package com.m78.mapper;

import com.m78.entity.TentmentCar;

public interface TentmentCarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TentmentCar record);

    int insertSelective(TentmentCar record);

    TentmentCar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TentmentCar record);

    int updateByPrimaryKey(TentmentCar record);
}