package com.m78.serviceImpl.dataCenter;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Car;
import com.m78.mapper.CarMapper;
import com.m78.service.dataCenter.CarService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class CarServiceImpl implements CarService {
    @Autowired
    private CarMapper carMapper;
    @Override
    public List<Car> getAllCar() {
        return carMapper.getAllCar();
    }
}
