package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.House;
import  com.m78.service.dataCenter.houseService;
import com.m78.mapper.HouseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
/**
 * 房屋接口实现类
 */
//注册为Bubbo服务
@Service(version="1.0.0")
public class houseServiceImpl implements  houseService {
    @Autowired
    private HouseMapper houseMapper;

    /**
     * 查询房屋列表
     */
    @Override
    public List<House> getHoust() {
        return houseMapper.getHoust();
    }

}
