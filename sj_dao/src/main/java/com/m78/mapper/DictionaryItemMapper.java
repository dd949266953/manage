package com.m78.mapper;

import com.m78.entity.Department;
import com.m78.entity.DictionaryItem;

import java.util.List;

public interface DictionaryItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DictionaryItem record);

    int insertSelective(DictionaryItem record);

    DictionaryItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DictionaryItem record);

    int updateByPrimaryKey(DictionaryItem record);
    /**
     * 查询楼宇类型
     */
    List<DictionaryItem> getBuildingType();

    /**
     * 查询职业类型
     */
    List<DictionaryItem> getDictionaryItem();

    /**
     * 查询房屋类型
     * @return
     */
    List<DictionaryItem>getHouseType();

    /**
     * 查询房屋状态
     * @return
     */
    List<DictionaryItem>getHouseState();

    /**
     * 查询车位类型
     * @return
     */
    List<DictionaryItem>getCarportType();

    /**
     * 查询住户身份
     * @return
     */
    List<DictionaryItem>getRelation();

    /**
     * 获取员工职位信息
     * @return
     */
    List<DictionaryItem> getUserOption();
}