package com.m78.service.bill;

import com.m78.entity.Chargename;

import java.util.List;

/**
 * 收费项
 */
public interface ChargenNameService {
    /**
     * 获取所有收费项
     * @return
     */
    List<Chargename> getAllCharName(int page,int pageSize,String name);

    /**
     * 获取总数
     * @param name
     * @return
     */
    Long getAllCount(String name);

    /**
     * 添加收费项
     * @param name
     * @return
     */
    int addChargenName(String name);

    /**
     * 删除收费项
     * @param id
     * @return
     */
    int deleteChargenName(Long id) throws  Exception;
}
