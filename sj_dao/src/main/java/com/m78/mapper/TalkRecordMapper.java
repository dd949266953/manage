package com.m78.mapper;

import com.m78.entity.TalkRecord;

public interface TalkRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TalkRecord record);

    int insertSelective(TalkRecord record);

    TalkRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TalkRecord record);

    int updateByPrimaryKey(TalkRecord record);
}