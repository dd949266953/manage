package com.m78.service.dataCenter;

import com.m78.entity.Car;
import com.m78.vo.carVo;

import java.util.List;

public interface CarService {
    /**
     * 查询所有车辆
     */
    List<carVo> getAllCar(String carNumber,String tenementName,int page,int limit);
}
