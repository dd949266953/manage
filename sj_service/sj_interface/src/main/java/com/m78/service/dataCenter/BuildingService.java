package com.m78.service.dataCenter;

import com.m78.entity.Building;

import java.util.List;

/**
 * 楼宇接口
 */
public interface BuildingService {

    /**
     * 查询楼宇列表
     */
    List<Building> getBuildingList(int page,int limit,String buildingName);

    /**
     * 删除楼宇
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 添加楼宇
     */
    int insert(Building record);
}
