package com.m78.mapper;

import com.m78.entity.Withoutuser;

public interface WithoutuserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Withoutuser record);

    int insertSelective(Withoutuser record);

    Withoutuser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Withoutuser record);

    int updateByPrimaryKey(Withoutuser record);
}