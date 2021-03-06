package com.m78.mapper;

import com.m78.entity.CommunityBuilding;

public interface CommunityBuildingMapper {
    int deleteByPrimaryKey(Long id);

    /**
     * 增加小区与楼宇关系
     * @param record
     * @return
     */
    int insert(CommunityBuilding record);

    int insertSelective(CommunityBuilding record);

    CommunityBuilding selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommunityBuilding record);

    int updateByPrimaryKey(CommunityBuilding record);
}