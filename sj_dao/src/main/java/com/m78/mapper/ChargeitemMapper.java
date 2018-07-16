package com.m78.mapper;

import com.m78.entity.Chargeitem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChargeitemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Chargeitem record);

    int insertSelective(Chargeitem record);

    Chargeitem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Chargeitem record);

    int updateByPrimaryKey(Chargeitem record);

    List<Chargeitem> getAllById(@Param("page")int page,@Param("pageSize") int pageSize,@Param("id") int id);

    Long getAllCount(@Param("id") int id);
}