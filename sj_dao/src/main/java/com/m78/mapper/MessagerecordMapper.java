package com.m78.mapper;

import com.m78.entity.Messagerecord;

public interface MessagerecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Messagerecord record);

    int insertSelective(Messagerecord record);

    Messagerecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Messagerecord record);

    int updateByPrimaryKey(Messagerecord record);
}