package com.m78.service.service;

import com.m78.entity.LifeOption;

import java.util.List;

/**
 * 导航标签
 */
public interface LifeOptionService {
    /**
     * 获取所有标签
     * @return
     */
    List<LifeOption> getAllOption();

    /**
     * 添加标签
     * @return
     */
    int addLifeOption(String name);
}
