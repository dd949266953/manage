package com.m78.mapper;

import com.m78.entity.Tenement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TenementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tenement record);

    int insertSelective(Tenement record);

    Tenement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tenement record);

    int updateByPrimaryKey(Tenement record);

    /**
     * 根据住户姓名获取住户详细住址-
     * @param name
     * @return
     */
    List<Tenement> getDetailAddressByName(@Param("name")String name);
}