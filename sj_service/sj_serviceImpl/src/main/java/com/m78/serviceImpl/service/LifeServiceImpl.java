package com.m78.serviceImpl.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Life;
import com.m78.mapper.LifeMapper;
import com.m78.service.service.LifeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 生活导航
 */
@Service
public class LifeServiceImpl implements LifeService {

    @Autowired
    private LifeMapper lifeMapper;

    @Override
    public List<Life> getAllLife(String name, int page, int limit) {
        int start=(page-1)*limit;
        return lifeMapper.getAllLife(name,start,limit);
    }

    @Override
    public Long getLifeCount(String name) {
        return lifeMapper.getLifeCount(name);
    }

    @Override
    public int deleteLifeById(Long lifeId) {
        return lifeMapper.deleteByPrimaryKey(lifeId);
    }
}
