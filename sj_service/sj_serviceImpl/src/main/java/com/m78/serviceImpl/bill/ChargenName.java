package com.m78.serviceImpl.bill;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Chargename;
import com.m78.mapper.ChargenameMapper;
import com.m78.service.bill.ChargenNameService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class ChargenName implements ChargenNameService {

    @Autowired
    private ChargenameMapper chargenameMapper;

    @Override
    public List<Chargename> getAllCharName(int page, int pageSize, String name) {
        int start=(page-1)*pageSize;
        return chargenameMapper.getChargename(start,pageSize,name);
    }

    @Override
    public Long getAllCount(String name) {
        return chargenameMapper.getAllcount(name);
    }

    @Override
    public int addChargenName(String name) {
        return chargenameMapper.addChargenName(name);
    }

    @Override
    public int deleteChargenName(Long id) throws  Exception{
        return chargenameMapper.deleteByPrimaryKey(id);
    }
}
