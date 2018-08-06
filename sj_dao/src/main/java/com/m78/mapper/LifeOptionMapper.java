package com.m78.mapper;

import com.m78.entity.LifeOption;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LifeOptionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LifeOption record);

    int insertSelective(LifeOption record);

    LifeOption selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LifeOption record);

    int updateByPrimaryKey(LifeOption record);

    //查询所有标签
    List<LifeOption> getAllOption();

    int addLifeOption(@Param("name") String name);
}