package com.m78.mapper;

import com.m78.entity.Noticetype;

public interface NoticetypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Noticetype record);

    int insertSelective(Noticetype record);

    Noticetype selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Noticetype record);

    int updateByPrimaryKey(Noticetype record);
}