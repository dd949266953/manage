package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;

import com.m78.service.building.BuildingService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 楼宇
 */
@Controller
@RequestMapping("/Building")
public class BuildingController {

    @Reference(version="1.0.0")

    private BuildingService buildingService;

    /**
     * 楼宇列表页面
     * @return
     */
    @RequestMapping("buildingList.html")
    public  String buildingList(){
        return "dataCenter/community/BuildingManagement/buildingList";
    }


    /**
     * 楼宇列表数据
     * @return
     */
    @RequestMapping("getBuilldingList")
    @ResponseBody
    public Object getBuildingList(){

        return DataTable.bindTableUtil(0,100,buildingService.getBuildingList());
    }
    /**
     * 根据id删除
     */
    @RequestMapping("deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(long id){
        return buildingService.deleteByPrimaryKey(id);
    }
}
