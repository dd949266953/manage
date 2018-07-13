package com.m78.mapper;

import com.m78.entity.Car;

public interface CarMapper {
    int deleteByPrimaryKey(Long carid);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Long carid);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}