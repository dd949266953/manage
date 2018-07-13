package com.m78.mapper;

import com.m78.entity.VoteCommunity;

public interface VoteCommunityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VoteCommunity record);

    int insertSelective(VoteCommunity record);

    VoteCommunity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VoteCommunity record);

    int updateByPrimaryKey(VoteCommunity record);
}