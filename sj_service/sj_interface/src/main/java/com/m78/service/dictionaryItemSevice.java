package com.m78.service;

import com.m78.entity.DicionaryType;
import com.m78.entity.DictionaryItem;

import java.util.List;

public interface dictionaryItemSevice {
    /**
     * 查询楼宇类型为高层底层，别墅的
     */
    List<DictionaryItem> getDictionary();
    /**
     * 查询职业类型
     */
    /**
     * 查询全部类型
     */
    List<DicionaryType> getdicionaryType();
}
