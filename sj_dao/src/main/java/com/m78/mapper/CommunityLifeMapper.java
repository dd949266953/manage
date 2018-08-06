package com.m78.mapper;

import com.m78.entity.CommunityLife;

public interface CommunityLifeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommunityLife record);

    int insertSelective(CommunityLife record);

    CommunityLife selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommunityLife record);

    int updateByPrimaryKey(CommunityLife record);
}