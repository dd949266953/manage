package com.m78.mapper;

import com.m78.entity.HouseCharitem;

public interface HouseCharitemMapper {
    int deleteByPrimaryKey(Long id);

    /**
     * 给房屋添加收费标准
     * @param record
     * @return
     */
    int insertChargeByHouseId(HouseCharitem record);

    int insertSelective(HouseCharitem record);

    HouseCharitem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HouseCharitem record);

    int updateByPrimaryKey(HouseCharitem record);
}