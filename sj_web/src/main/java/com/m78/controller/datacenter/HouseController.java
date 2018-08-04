package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.dataCenter.BuildingService;
import com.m78.service.dataCenter.CommunityService;
import com.m78.service.dataCenter.HouseService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "House")
@Controller
public class HouseController {

    @Reference(version = "1.0.0")
    private HouseService houseService;

    @Reference(version = "1.0.0")
    private CommunityService communityService;

    @Reference(version = "1.0.0")
    private BuildingService buildingService;

    /**
     * 房屋列表界面
     * @return
     */
    @RequestMapping("houseList.html")
    public String houseList(){
        return "dataCenter/house/houseList";
    }

    /**
     * 添加房屋页面
     * @return
     */
    @RequestMapping("addHouse.html")
    public Object addHouse(){
        ModelAndView mv=new ModelAndView();
        //所有小区id和名称
        mv.addObject("communityList",communityService.getCommunityIdAndName());
        return "dataCenter/house/addHouse";
    }

    /**
     * 获取所有房屋
     * @param houseName
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/getAllHouse")
    @ResponseBody
    public Object getAllHouse(@RequestParam("houseName")String houseName,@RequestParam("page")int page,@RequestParam("limit")int limit) {
        return DataTable.bindTableUtil(0, 100, houseService.getAllHouse(houseName, page, limit));
    }
}
