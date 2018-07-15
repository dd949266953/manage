package com.m78.controller.datacenter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("HouseList")
@Controller
public class HouseConntroller {
    /**
     * 房屋列表11213
     * @return
     */
    @RequestMapping("houstList.html")
    public String houstList(){
        return "dataCenter/community/houstManagement/houseList";
    }

}
