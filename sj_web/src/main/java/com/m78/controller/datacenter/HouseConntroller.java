package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;
import  com.m78.service.dataCenter.houseService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 房屋
 */
@RequestMapping("House")
@Controller
public class HouseConntroller {

    @Reference(version="1.0.0")
    private houseService houseService;

    /**
     * 房屋列表11213
     * @return
     */
    @RequestMapping("houseList.html")
    public String houstList(){
        return "dataCenter/house/houseList";
    }


    @RequestMapping("getHouse")
    @ResponseBody
    public Object getHouse(){
        return DataTable.bindTableUtil(0,100,houseService.getHoust());
    }

}
