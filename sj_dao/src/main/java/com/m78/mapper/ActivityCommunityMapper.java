package com.m78.mapper;

import com.m78.entity.ActivityCommunity;

public interface ActivityCommunityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ActivityCommunity record);

    int insertSelective(ActivityCommunity record);

    ActivityCommunity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActivityCommunity record);

    int updateByPrimaryKey(ActivityCommunity record);
}