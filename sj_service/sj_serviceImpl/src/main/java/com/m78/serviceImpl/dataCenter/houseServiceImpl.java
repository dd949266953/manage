package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.service.dataCenter.HouseService;
import com.m78.mapper.HouseMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 房屋接口实现类
 */
//注册为Bubbo服务
@Service(version="1.0.0")
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;



}
