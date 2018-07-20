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

    List<Tenement> getAllTenement();
}