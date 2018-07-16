package com.m78.serviceImpl;
import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.DicionaryType;
import com.m78.entity.DictionaryItem;
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
    private DicionaryTypeMapper dicionaryTypeMapper;
    /**
     * 查询typeid为1的
     * @return
     */
    @Override
    public List<DictionaryItem> getDictionary() {
        return dictionaryItemMapper.getDictionary();

    }

    /**
     * 职业类型
     * @return
     */
    @Override
    public List<DicionaryType> getdicionaryType() {
        return dicionaryTypeMapper.getdicionaryType();
    }

}
