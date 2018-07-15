package com.m78.service.dataCenter;

import com.m78.entity.House;

import java.util.List;

/**
 * 房屋接口
 */
public interface houseService {
    /**
     * 查询房屋信息
     */
    List<House> getHoust();
}
