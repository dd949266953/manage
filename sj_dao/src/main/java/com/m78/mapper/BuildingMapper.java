package com.m78.mapper;

import com.m78.entity.Building;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuildingMapper {

    /**
     * 删除楼宇
     */
    int deleteByPrimaryKey(Long id);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);

    /**
     * 查询楼宇数据
     * @return
     */
    List<Building> getBuildingList(@Param("start") int start,@Param("limit") int limit,@Param("buildingName")String buildingName);

    /**
     * 查询楼宇总数根据名称
     * @return
     */
    Long getBuildingCountByName(@Param("buildingName")String buildingName);
}