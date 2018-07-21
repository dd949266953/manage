package com.m78.service.dataCenter;

import com.m78.entity.Tenement;

import java.util.List;

/**
 * 住户接口
 */
public interface TenementService {

    /**
     * 获取所有住户
     * @return
     */
    List<Tenement> getAllTenement();

    /**
     * 根据住户姓名获取住户详细住址
     * @return
     */
    List<Tenement> getDetailAddressByName(String tenementName,int page,int limit);

    /**
     * 根据住户姓名查询住户总数
     * @return
     */
    int getTenementCountByName(String tenementName);

    /**
     * 根据住户手机号查询车位主键
     * @param phone
     * @return
     */
    Long getCarportIdByTenementPhone(String phone);

    /**
     * 根据住户手机号查询房屋主键
     * @param phone
     * @return
     */
    Long getHouseIdByTenementPhone(String phone);
}
