package com.m78.mapper;

import com.m78.entity.Building;

import java.util.List;

public interface BuildingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);

    List<Building> getBuildingList();
}