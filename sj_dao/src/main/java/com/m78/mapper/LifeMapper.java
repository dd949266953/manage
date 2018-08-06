package com.m78.mapper;

import com.m78.entity.Life;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LifeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Life record);

    int insertSelective(Life record);

    Life selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Life record);

    int updateByPrimaryKey(Life record);
    //获取所有信息
    List<Life> getAllLife(@Param("name")String name,@Param("start") int start,@Param("end") int end);
    //获取总条数
    Long getLifeCount(@Param("name") String name);
}