package com.m78.controller.datacenter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "House")
@Controller
public class HouseController {

    /**
     * 房屋列表界面
     * @return
     */
    @RequestMapping("houseList.html")
    public  String buildingList(){
        return "dataCenter/house/houseList";
    }
}
