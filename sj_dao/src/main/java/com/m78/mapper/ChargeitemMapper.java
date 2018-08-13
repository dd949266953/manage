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
    //查询全部收费标准
    List<Chargeitem> getAllCharge();
    //数据表格查询所有
    List<Chargeitem> getAllById(@Param("page")int page,@Param("pageSize") int pageSize,@Param("id") int id);
    //查询总数
    Long getAllCount(@Param("id") int id);
    //根据收费项id查询
    List<Chargeitem> getCharNameById();
    //根据名称查id
    Long getCharItemIdByName(@Param("name") String name);
}