package com.m78.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;

import com.m78.entity.Community;
import com.m78.mapper.CommunityMapper;
import com.m78.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
//注册为Bubbo服务
@Service(version="1.0.0")
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    private CommunityMapper communityMapper;


    /**
     * 查询小区
     */
    @Override
    public List<Community> findAll() {
        return communityMapper.findAll();
    }

    /**
     * 添加小区
     */
    @Override
    public int insert(Community record){
        return communityMapper.insert(record);
    }

    /**
     * 删除小区
     * @param id
     * @return id
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return communityMapper.deleteByPrimaryKey(id);
    }



}
