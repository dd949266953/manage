package com.m78.mapper;

import com.m78.entity.Chargename;

public interface ChargenameMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Chargename record);

    int insertSelective(Chargename record);

    Chargename selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Chargename record);

    int updateByPrimaryKey(Chargename record);
}