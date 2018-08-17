package com.m78.mapper;

import com.m78.entity.HouseTentment;
import org.apache.ibatis.annotations.Param;

public interface HouseTentmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HouseTentment record);

    int insertSelective(HouseTentment record);

    HouseTentment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HouseTentment record);

    int updateByPrimaryKey(HouseTentment record);

    /**
     * 查询住户和房屋有没有关系
     * @param houseId
     * @param tentmentId
     * @return
     */
    int getTenementAndHouseCount(@Param("houseid") Long houseId,@Param("tentmentid") Long tentmentId);

    /**
     * 修改关系 根据住户和房屋id
     * @return
     */
    int updateRelationByTenementIdAndHouseId(HouseTentment record);
}