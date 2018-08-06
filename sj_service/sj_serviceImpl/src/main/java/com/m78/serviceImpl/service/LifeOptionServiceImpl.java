package com.m78.serviceImpl.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.LifeOption;
import com.m78.mapper.LifeOptionMapper;
import com.m78.service.service.LifeOptionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 导航标签
 */
@Service
public class LifeOptionServiceImpl implements LifeOptionService {

    @Autowired
    private LifeOptionMapper lifeOptionMapper;

    @Override
    public List<LifeOption> getAllOption() {
        return lifeOptionMapper.getAllOption();
    }
}
