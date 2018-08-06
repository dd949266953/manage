package com.m78.mapper;

import com.m78.entity.Building;
import com.m78.vo.BuildingVo;
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

    /**
     * 根据id修改楼宇
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Building record);

    /**
     * 查询楼宇id和名称
     * @return
     */
    List<BuildingVo>getBuildingIdAndNameByCommunityId(@Param("communityId") Long communityId);

    int updateByPrimaryKey(Building record);

    /**
     * 查询楼宇数据
     * @return
     */
    List<BuildingVo> getBuildingList(@Param("start") int start, @Param("limit") int limit, @Param("buildingName")String buildingName);

    /**
     * 查询楼宇总数根据名称
     * @return
     */
    Long getBuildingCountByName(@Param("buildingName")String buildingName);

    /**
     * 查询单元总数根据楼宇id
     */
    Long getUnitTotalByBuildingId(@Param("buildingId")Long buildingId);

    /**
     * 查询楼层总数根据楼宇id
     * @return
     */
    Long getBuildingPliesById(@Param("buildingId")Long buildingId);
}