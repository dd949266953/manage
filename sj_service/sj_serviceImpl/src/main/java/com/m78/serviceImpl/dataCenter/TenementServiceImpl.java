package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Tenement;
import com.m78.mapper.TenementMapper;
import com.m78.service.dataCenter.TenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service(version="1.0.0")
public class TenementServiceImpl implements TenementService {

    @Autowired
    private TenementMapper tenementMapper;

    /**
     * 根据姓名查询住户详细住址
     * @param name
     * @return
     */
    @Transactional
    @Override
    public List<Tenement> getDetailAddressByName(String name) {
        return tenementMapper.getDetailAddressByName(name);
    }

    /**
     * 根据电话查询房屋id
     * @param phone
     * @return
     */
    @Transactional
    @Override
    public Long getHouseIdByTenementPhone(String phone) {
        return tenementMapper.getHouseIdByTenementPhone(phone);
    }

    /**
     * 根据电话查询车位id
     * @param phone
     * @return
     */
    @Transactional
    @Override
    public Long getCarportIdByTenementPhone(String phone) {
        return tenementMapper.getCarportIdByTenementPhone(phone);
    }

}
