package com.m78.service.dataCenter;

import com.m78.entity.Tenement;

import java.util.List;

public interface TenementService {
    /**
     * 根据住户姓名获取住户详细住址-
     * @param name
     * @return
     */
<<<<<<< HEAD
    List<Tenement> getDetailAddressByName(String name);

    /**
     * 根据住户手机号查询房屋主键
     * @param phone
     * @return
     */
    Long getHouseIdByTenementPhone(String phone);

    /**
     * 根据住户手机号查询车位主键
     * @param phone
     * @return
     */
    Long getCarportIdByTenementPhone(String phone);
=======
    List<Tenement> getDetailAddressByName(String name,int page,int limit);

    /**
     * 获取用户总数
     * @return
     */
    int getAllCount(String name);
>>>>>>> dc462ce7f8642a819c73fa82acf1abefcbba1600
}