package com.m78.mapper;

import com.m78.entity.Staffnotice;

public interface StaffnoticeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Staffnotice record);

    int insertSelective(Staffnotice record);

    Staffnotice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Staffnotice record);

    int updateByPrimaryKey(Staffnotice record);
}