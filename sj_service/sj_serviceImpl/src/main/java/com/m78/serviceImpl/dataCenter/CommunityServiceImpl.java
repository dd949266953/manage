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
        return communityMapper.findAll(start,limit,communityName);
    }
    /**
     * 查询小区数量根据名字
     */
    @Override
    public long getCommunityCountByName(String communityName) {
        return communityMapper.getCommunityCountByName(communityName);
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

        System.out.println("=================================================");
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

    /**
     * 根据小区名称查询小区id
     * @param communityName
     * @return
     */
    @Override
    public Long getCommunityIdByName(String communityName) {
        return communityMapper.getCommunityIdByName(communityName);
    }

    /**
     * 根据id查询小区
     * @param id
     * @return
     */
    @Override
    public Community selectByPrimaryKey(Long id) {
        return communityMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据小区id修改小区
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(Community record) {
        return communityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Community> getIdNameAddressByName(int page, int limit, String name) {
        int start=(page-1)*limit;
        return communityMapper.getIdNameAddressByName(start,limit,name);
    }
}
