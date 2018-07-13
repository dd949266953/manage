package com.m78.mapper;

import com.m78.entity.Childnotice;

public interface ChildnoticeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Childnotice record);

    int insertSelective(Childnotice record);

    Childnotice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Childnotice record);

    int updateByPrimaryKey(Childnotice record);
}