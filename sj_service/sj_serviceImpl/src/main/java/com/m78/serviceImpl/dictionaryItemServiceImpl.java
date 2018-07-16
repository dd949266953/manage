package com.m78.serviceImpl;
import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Department;
import com.m78.entity.DicionaryType;
import com.m78.entity.DictionaryItem;
import com.m78.mapper.DepartmentMapper;
import com.m78.mapper.DicionaryTypeMapper;
import com.m78.mapper.DictionaryItemMapper;
import com.m78.service.dictionaryItemSevice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
//注册为Bubbo服务
@Service(version="1.0.0")
public class dictionaryItemServiceImpl  implements  dictionaryItemSevice{

    @Autowired
    private  DictionaryItemMapper dictionaryItemMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    /**
     * 查询typeid为1的
     * @return
     */
    @Override
    public List<DictionaryItem> getDictionary() {
        return dictionaryItemMapper.getDictionary();

    }

    /**
     * 查询部门信息
     * @return
     */
    @Override
    public List<Department> getDepartment() {
        return departmentMapper.getDepartment();
    }

    /**
     * 查询职业类型
     * @return
     */
    @Override
    public List<DictionaryItem> getDictionaryItem() {
        return dictionaryItemMapper.getDictionaryItem();
    }


}
