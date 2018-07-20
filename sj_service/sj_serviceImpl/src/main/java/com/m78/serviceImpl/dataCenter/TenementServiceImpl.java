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


    @Override
    public List<Tenement> getAllTenement() {
        return tenementMapper.getAllTenement();
    }
}
