package com.m78.mapper;

import com.m78.entity.TentmentCarport;

public interface TentmentCarportMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TentmentCarport record);

    int insertSelective(TentmentCarport record);

    TentmentCarport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TentmentCarport record);

    int updateByPrimaryKey(TentmentCarport record);
}