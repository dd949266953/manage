package com.m78.mapper;

import com.m78.entity.CommunityVote;

public interface CommunityVoteMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommunityVote record);

    int insertSelective(CommunityVote record);

    CommunityVote selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommunityVote record);

    int updateByPrimaryKey(CommunityVote record);
}