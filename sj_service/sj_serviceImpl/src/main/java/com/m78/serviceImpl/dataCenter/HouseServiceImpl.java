package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.mapper.HouseMapper;
import com.m78.service.dataCenter.HouseService;
import com.m78.vo.HouseVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;
    @Override
    public List<HouseVo> getAllHouse(String houseName, int page, int limit) {
        int start=(page-1)*limit;
        return houseMapper.getAllHouse(houseName,start,limit);
    }
}
