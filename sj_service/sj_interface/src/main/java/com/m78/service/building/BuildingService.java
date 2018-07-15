package com.m78.service.building;

import com.m78.entity.Building;

import java.util.List;

public interface BuildingService {

    /**
     * 查询楼宇列表
     */
    List<Building> getBuildingList();

    /**
     * 删除住户
     */
    int deleteByPrimaryKey(Long id);
}
