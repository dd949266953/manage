package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Tenement;
import com.m78.mapper.TenementMapper;
import com.m78.service.dataCenter.TenementService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class TenementServiceImpl implements TenementService {
    @Autowired
    private TenementMapper tenementMapper;

    @Override
    public List<Tenement> getDetailAddressByName(String name, int page, int limit) {
        int start=(page-1)*limit;
        return tenementMapper.getDetailAddressByName(name,start,limit);
    }

    @Override
    public int getAllCount(String name) {
        return tenementMapper.getAllCount(name);
    }
}
