package com.m78.mapper;

import com.m78.entity.TalkStaff;

public interface TalkStaffMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TalkStaff record);

    int insertSelective(TalkStaff record);

    TalkStaff selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TalkStaff record);

    int updateByPrimaryKey(TalkStaff record);
}