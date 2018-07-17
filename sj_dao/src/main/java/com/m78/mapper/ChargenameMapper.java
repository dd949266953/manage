package com.m78.mapper;

import com.m78.entity.Chargename;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChargenameMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Chargename record);

    int insertSelective(Chargename record);

    Chargename selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Chargename record);

    int updateByPrimaryKey(Chargename record);
    //查询所有收费项
    List<Chargename> getChargename(@Param("page") int page,@Param("pageSize") int pageSize,@Param("name") String name);
    //查询总数
    Long getAllcount(@Param("name") String name);
    //添加收费项
    int addChargenName(@Param("name") String name);
    //获取收费项目 下拉框
    List<Chargename> getCharName();
}