package com.m78.mapper;

import com.m78.entity.CommunityTalk;

public interface CommunityTalkMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommunityTalk record);

    int insertSelective(CommunityTalk record);

    CommunityTalk selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommunityTalk record);

    int updateByPrimaryKey(CommunityTalk record);
}