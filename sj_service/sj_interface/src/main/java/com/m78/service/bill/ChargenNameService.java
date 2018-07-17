package com.m78.service.bill;

import com.m78.entity.Chargeitem;
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

    /**
     * 根据id获取所有公式
     * @return
     */
    List<Chargeitem> getAllById(int page,int pageSize,int id);

    /**
     * 获取所有公式数量
     * @return
     */
    Long getAllCount(int id);

    /**
     * 删除公式
     * @param id
     * @return
     */
    int deleteCharItem(Long id)throws  Exception;

    /**
     * 获取收费项目 下拉框
     * @return
     */
    List<Chargename> getCharName();

    /**
     * 添加公式
     * @param chargeitem
     * @return
     */
    int addCharTtem(Chargeitem chargeitem);
}
