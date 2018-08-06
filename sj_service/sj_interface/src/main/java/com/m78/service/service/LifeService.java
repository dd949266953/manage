package com.m78.service.service;

import com.m78.entity.Life;

import java.util.List;

/**
 * 生活导航
 */
public interface LifeService {
    /**
     * 获取所有导航信息
     * @return
     */
    List<Life> getAllLife(String name,int page,int limit);

    /**
     * 获取总数
     * @param name
     * @return
     */
    Long getLifeCount(String name);

    /**
     * 根据id删除导航
     * @param lifeId
     * @return
     */
    int deleteLifeById(Long lifeId);
}
