package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.dataCenter.CarportService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/Carport")
@Controller
public class CarportController {

    @Reference(version = "1.0.0")
    private CarportService carportService;

    @RequestMapping(value = "/carportList.html")
    public String carportList(){
        return "dataCenter/carport/carportList";
    }

    @RequestMapping(value = "/getAllCarport")
    @ResponseBody
    public Object getAllCarport(String carportNo,int page,int limit){
        return DataTable.bindTableUtil(0,carportService.getCountCarport(Long.valueOf(carportNo)),carportService.getAllCarport(Long.valueOf(carportNo),page,limit));
    }

}
