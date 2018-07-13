package com.m78.service;

import com.m78.entity.Community;

import java.util.List;

public interface CommunityService {
    /**
     * 查询所有小区
     * @return 小区列表
     */
    List<Community> findAll();

    /**
     * 添加小区
     */
    int insert(Community record);



    /**
     * 删除小区
     */
    int deleteByPrimaryKey(Long id);
}
