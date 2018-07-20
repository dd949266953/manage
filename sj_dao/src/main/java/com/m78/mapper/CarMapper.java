package com.m78.mapper;

import com.m78.entity.Car;

import java.util.List;

public interface CarMapper {
    int deleteByPrimaryKey(Long carid);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Long carid);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);

    /**
     * 查询所有车辆
     */
    List<Car> getAllCar();
}