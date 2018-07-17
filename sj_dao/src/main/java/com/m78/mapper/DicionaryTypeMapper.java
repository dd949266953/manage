package com.m78.mapper;

import com.m78.entity.DicionaryType;

import java.util.List;

public interface DicionaryTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DicionaryType record);

    int insertSelective(DicionaryType record);

    DicionaryType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DicionaryType record);

    int updateByPrimaryKey(DicionaryType record);
}