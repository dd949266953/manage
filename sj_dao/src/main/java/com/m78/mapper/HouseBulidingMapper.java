package com.m78.mapper;

import com.m78.entity.HouseBuliding;
import org.apache.ibatis.annotations.Param;

public interface HouseBulidingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(@Param("buildingid")Long buildingid,@Param("houseid")Long houseid);

    int insertSelective(HouseBuliding record);

    HouseBuliding selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HouseBuliding record);

    int updateByPrimaryKey(HouseBuliding record);
}