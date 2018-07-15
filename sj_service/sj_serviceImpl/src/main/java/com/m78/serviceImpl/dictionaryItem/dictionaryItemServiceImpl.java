package com.m78.serviceImpl.dictionaryItem;
import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.DictionaryItem;
import com.m78.mapper.DictionaryItemMapper;
import com.m78.service.dictionItem.dictionaryItemSevice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
//注册为Bubbo服务
@Service(version="1.0.0")
public class dictionaryItemServiceImpl  implements  dictionaryItemSevice{

    @Autowired
    private  DictionaryItemMapper dictionaryItemMapper;

    /**
     * 查询typeid为1的
     * @return
     */
    @Override
    public List<DictionaryItem> getDictionary() {
        return dictionaryItemMapper.getDictionary();

    }
}
