package com.m78.service.dataCenter;

import com.m78.vo.HouseVo;

import java.util.List;

public interface HouseService {
    /**
     * 查询所有房屋
     * @return
     */
    List<HouseVo> getAllHouse(String houseName,int start,int limit);
}
