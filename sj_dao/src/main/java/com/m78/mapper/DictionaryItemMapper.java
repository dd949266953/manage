package com.m78.mapper;

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
     * 查询楼宇类型为高层底层，别墅的
     */
    List<DictionaryItem> getDictionary();
}