package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.dataCenter.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {
    @Reference(version = "1.0.0")
    private CarService carService;

    @RequestMapping("getAllCar")
    @ResponseBody
    public Object getAllCar(){
        return carService.getAllCar();
    }
}
