package com.m78.service;

import com.m78.entity.Department;
import com.m78.entity.DicionaryType;
import com.m78.entity.DictionaryItem;

import java.util.List;

public interface DictionaryItemSevice {

    /**
     * 查询所有部门
     */
    List<Department> getDepartment();
    /**
     * 查询职业类型
     */
    List<DictionaryItem> getDictionaryItem();

}
