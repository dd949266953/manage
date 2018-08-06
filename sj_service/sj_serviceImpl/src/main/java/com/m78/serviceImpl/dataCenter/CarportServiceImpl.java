package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.mapper.CarportMapper;
import com.m78.service.dataCenter.CarportService;
import com.m78.vo.CarportVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class CarportServiceImpl implements CarportService {
    @Autowired
    private CarportMapper carportMapper;

    @Override
    public List<CarportVo> getAllCarport(Long carportNo, int page, int limit) {
        int start=(page-1)*limit;
        return carportMapper.getAllCarport(carportNo,start,limit);
    }

    @Override
    public Long getCountCarport(Long carportNo) {
        return carportMapper.getCountCarport(carportNo);
    }
}
