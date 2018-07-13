package com.m78.mapper;

import com.m78.entity.Carport;

public interface CarportMapper {
    int deleteByPrimaryKey(Long carportno);

    int insert(Carport record);

    int insertSelective(Carport record);

    Carport selectByPrimaryKey(Long carportno);

    int updateByPrimaryKeySelective(Carport record);

    int updateByPrimaryKey(Carport record);
}