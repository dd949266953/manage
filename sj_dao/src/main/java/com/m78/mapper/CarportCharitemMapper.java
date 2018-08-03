package com.m78.mapper;

import com.m78.entity.CarportCharitem;

public interface CarportCharitemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CarportCharitem record);

    int insertSelective(CarportCharitem record);

    CarportCharitem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CarportCharitem record);

    int updateByPrimaryKey(CarportCharitem record);
}