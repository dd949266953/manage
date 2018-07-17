package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;

import com.m78.entity.Community;
import com.m78.mapper.CommunityMapper;
import com.m78.service.dataCenter.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 小区接口实现类
 */
//注册为Bubbo服务
@Service(version="1.0.0")
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    private CommunityMapper communityMapper;
    /**
     * 查询小区
     */
    @Override
    public List<Community> findAll(int page,int limit,String communityName) {
        int start=(page-1)*limit;
        System.out.println(communityName+"communityName");
        return communityMapper.findAll(start,limit,communityName);
    }

    /**
     * 添加小区
     */
    @Override
    public int insert(Community record){
        return communityMapper.insert(record);
    }

    /**
     * 查询名称及id
     * @return
     */
    @Override
    public List<Community> getCommunityIdAndName() {
        return communityMapper.getCommunityIdAndName();
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
