package com.m78.mapper;

import com.m78.entity.Tenement;
import com.m78.vo.TenementVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TenementMapper {
    /**
     * 删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    int insert(Tenement record);

    int insertSelective(Tenement record);

    Tenement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tenement record);

    int updateByPrimaryKey(Tenement record);

    /**
     * 获取总记录数
     * 根据名称
     *
     * @return
     */
    Integer getTenementCount(@Param("name") String name);

    /**
     * 获取所有住户
     *
     * @return
     */
    List<TenementVo> getAllTenement(@Param("name") String name, @Param("start") int start, @Param("limit") int limit);

    /**
     * 根据主键id查询住户详情
     *
     * @param id
     * @return
     */
    Tenement getTenementByPrimaryKeyId(@Param("id") Long id);

    /**
     * 根据住户姓名获取住户详细住址
     *
     * @return
     */
    List<Tenement> getDetailAddressByName(@Param("tenementName") String tenementName, @Param("start") int start, @Param("limit") int limit);

    /**
     * 根据住户姓名查询住户总数
     *
     * @return
     */
    int getTenementCountByName(@Param("name") String name);

    /**
     * 根据住户手机号查询车位主键
     *
     * @param phone
     * @return
     */
    Long getCarportIdByTenementPhone(@Param("phone") String phone);

    /**
     * 根据住户手机号查询房屋主键
     *
     * @param phone
     * @return
     */
    Long getHouseIdByTenementPhone(@Param("phone") String phone);

    /**
     * 根据住户手机号查询房屋主键
     *
     * @return
     */
    Tenement getDetailTenementById(@Param("tenementId") Long tenementId);

    /**
     * 查询小区下的所有手机号根据小区id
     *
     * @return
     */
    List<String> getPhoneByCommunityId(@Param("communityId") Long communityId);

    /**
     * 查询住户相关房屋信息
     * @param tenementId
     * @return
     */
    List<TenementVo>getDetailHouseByTenementId(@Param("tenementId")Long tenementId);

    /**
     * 查询住户相关车位信息
     * @param tenementId
     * @return
     */
    List<TenementVo>getDetailCarportByTenementId(@Param("tenementId")Long tenementId);

    /**
     * 查询住户相关车辆信息
     * @param tenementId
     * @return
     */
    List<TenementVo> getDetailCarByTenementId(@Param("tenementId")Long tenementId);

    /**
     * 查询相关住户信息
     * @param tenementId
     * @return
     */
    List<TenementVo> getDetailRelationByTenementId(@Param("tenementId")Long tenementId);

    /**
     * 查询住户根据小区
     * @return
     */
    List<Tenement>getTenementByCommunity(@Param("communityId")Long communityId);

}