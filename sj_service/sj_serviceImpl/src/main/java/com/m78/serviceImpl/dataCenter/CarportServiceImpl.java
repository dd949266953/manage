package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.DictionaryItem;
import com.m78.mapper.CarportMapper;
import com.m78.mapper.DictionaryItemMapper;
import com.m78.service.dataCenter.CarportService;
import com.m78.vo.CarportVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class CarportServiceImpl implements CarportService {
    @Autowired
    private CarportMapper carportMapper;
    @Autowired
    private DictionaryItemMapper dictionaryItemMapper;

    @Override
    public List<CarportVo> getAllCarport(String carportName,int page, int limit) {
        int start=(page-1)*limit;
        return carportMapper.getAllCarport(carportName,start,limit);
    }

    @Override
    public Long getCountCarport(String carportName) {
        return carportMapper.getCountCarport(carportName);
    }

    @Override
    public List<DictionaryItem> getCarportType() {
        return dictionaryItemMapper.getCarportType();
    }

    @Override
    public List<DictionaryItem> getCarportState() {
        return dictionaryItemMapper.getHouseState();
    }
}
