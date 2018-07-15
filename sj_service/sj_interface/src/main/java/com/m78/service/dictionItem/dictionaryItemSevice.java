package com.m78.service.dictionItem;

import com.m78.entity.DictionaryItem;

import java.util.List;

public interface dictionaryItemSevice {
    /**
     * 查询楼宇类型为高层底层，别墅的
     */
    List<DictionaryItem> getDictionary();
}
