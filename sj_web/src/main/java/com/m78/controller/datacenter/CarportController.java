package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.dataCenter.CarportService;
import com.m78.service.dataCenter.CommunityService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "/Carport")
@Controller
public class CarportController {
    @Reference(version = "1.0.0")
    private CommunityService communityService;
    @Reference(version = "1.0.0")
    private CarportService carportService;

    @RequestMapping(value = "/carportList.html")
    public String carportList(){
        return "dataCenter/carport/carportList";
    }

    @RequestMapping(value = "/addCarport.html")
    public Object addCarport(){
        ModelAndView mv =new ModelAndView();
        mv.setViewName("dataCenter/carport/addCarport");
        //车位状态
        mv.addObject("carportState",carportService.getCarportState());
        //车位类型
        mv.addObject("carportType",carportService.getCarportType());
        //小区名称
        mv.addObject("community",communityService.getCommunityIdAndName());
        return mv;
    }

    @RequestMapping(value = "/getAllCarport")
    @ResponseBody
    public Object getAllCarport(String carportName,int page,int limit){
        return DataTable.bindTableUtil(0,carportService.getCountCarport(carportName),carportService.getAllCarport(carportName,page,limit));
    }

}
