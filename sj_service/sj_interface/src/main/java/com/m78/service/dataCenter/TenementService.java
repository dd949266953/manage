package com.m78.service.dataCenter;

import com.m78.entity.Tenement;

import java.util.List;

public interface TenementService {
    /**
     * 根据住户姓名获取住户详细住址-
     * @param name
     * @return
     */
    List<Tenement> getDetailAddressByName(String name);
}
