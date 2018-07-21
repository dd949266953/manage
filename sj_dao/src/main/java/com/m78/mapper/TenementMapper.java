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
     * 获取所有住户
     * @return
     */
    List<Tenement> getAllTenement();

    /**
     * 根据住户姓名获取住户详细住址
     * @return
     */
    List<Tenement> getDetailAddressByName(@Param("tenementName")String tenementName,@Param("start") int start,@Param("limit") int limit);

    /**
     * 根据住户姓名查询住户总数
     * @return
     */
    int getTenementCountByName(@Param("name")String name);

    /**
     * 根据住户手机号查询车位主键
     * @param phone
     * @return
     */
    Long getCarportIdByTenementPhone(@Param("phone")String phone);

    /**
     * 根据住户手机号查询房屋主键
     * @param phone
     * @return
     */
    Long getHouseIdByTenementPhone(@Param("phone")String phone);
}