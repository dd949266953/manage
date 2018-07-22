package com.m78.mapper;

import com.m78.entity.House;

import java.util.List;

public interface HouseMapper {
    int deleteByPrimaryKey(Long houseid);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Long houseid);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);





}