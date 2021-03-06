package com.m78.service.dataCenter;

import com.m78.entity.Community;

import java.util.List;

/**
 * 小区接口
 */
public interface CommunityService {
    /**
     * 查询所有小区
     * @return 小区列表
     */
    List<Community> findAll(int page,int limit,String name);

    /**
     * 查询小区数量根据名字
     */
    long getCommunityCountByName(String communityName);

    /**
     * 添加小区
     */
    int insert(Community record);

    /**
     * 查询小区名称 及id
     */
    List<Community> getCommunityIdAndName();

    /**
     * 删除小区
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 根据小区名称查询小区id
     */
    Long getCommunityIdByName(String communityName);

    /**
     * 根据小区id 查询小区
     * @param id
     * @return
     */
    Community selectByPrimaryKey(Long id);

    /**
     * 根据小区id修改小区
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Community record);

    /**
     * 查询id,name,住址根据name 带分页
     */
    List<Community> getIdNameAddressByName(int page,int limit,String name);

}
