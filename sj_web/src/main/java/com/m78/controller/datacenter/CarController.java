package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.dataCenter.CarService;
import com.m78.service.dataCenter.CommunityService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "Car")
@Controller
public class CarController {
    @Reference(version = "1.0.0")
    private CommunityService communityService;
    @Reference(version = "1.0.0")
    private CarService carService;

    @RequestMapping(value = "/carList.html")
    public String carList(){
        return "dataCenter/car/carList";
    }

    @RequestMapping(value = "/addCar.html")
    public Object addCar(){
        ModelAndView mv=new ModelAndView();
        //小区名称
        mv.addObject("community",communityService.getCommunityIdAndName());
        mv.setViewName("dataCenter/car/addCar");
        return mv;
    }

    @RequestMapping("getAllCar")
    @ResponseBody
    public Object getAllCar(String param, int page, int limit){
        return DataTable.bindTableUtil(0,100,carService.getAllCar(param,param,page,limit));
    }
}
