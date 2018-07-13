package com.m78.mapper;

import com.m78.entity.CommunityNotice;

public interface CommunityNoticeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommunityNotice record);

    int insertSelective(CommunityNotice record);

    CommunityNotice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommunityNotice record);

    int updateByPrimaryKey(CommunityNotice record);
}