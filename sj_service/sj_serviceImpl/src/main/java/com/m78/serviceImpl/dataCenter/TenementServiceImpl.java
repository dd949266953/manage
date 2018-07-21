package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Tenement;
import com.m78.mapper.TenementMapper;
import com.m78.service.dataCenter.TenementService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 住户实现类
 */
@Service(version="1.0.0")
public class TenementServiceImpl implements TenementService {

    @Autowired
    private TenementMapper tenementMapper;

    /**
     * 获取所有住户
     * @return
     */
    @Override
    public List<Tenement> getAllTenement() {
        return tenementMapper.getAllTenement();
    }

    /**
     * 根据住户姓名获取住户详细住址
     * @return
     */
    @Override
    public List<Tenement> getDetailAddressByName(String tenementName, int page, int limit) {
        int start=(page-1)*limit;
        return tenementMapper.getDetailAddressByName(tenementName,start,limit);
    }

    /**
     * 根据住户姓名查询住户总数
     * @return
     */
    @Override
    public int getTenementCountByName(String tenementName) {
        return tenementMapper.getTenementCountByName(tenementName);
    }

    /**
     * 根据住户手机号查询车位主键
     * @param phone
     * @return
     */
    @Override
    public Long getCarportIdByTenementPhone(String phone) {
        return tenementMapper.getCarportIdByTenementPhone(phone);
    }

    /**
     * 根据住户手机号查询房屋主键
     * @param phone
     * @return
     */
    @Override
    public Long getHouseIdByTenementPhone(String phone) {
        return tenementMapper.getHouseIdByTenementPhone(phone);
    }
}
