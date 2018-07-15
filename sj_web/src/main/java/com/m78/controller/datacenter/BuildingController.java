package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;

import com.m78.entity.Building;
import com.m78.entity.Community;
import com.m78.entity.DictionaryItem;
import com.m78.service.CommunityService;
import com.m78.service.building.BuildingService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import  com.m78.service.dictionItem.dictionaryItemSevice;
import java.util.List;

/**
 * 楼宇
 */
@RequestMapping("/Building")
@Controller
public class BuildingController {

    @Reference(version="1.0.0")
    private BuildingService buildingService;
    @Reference(version="1.0.0")
    private CommunityService communityService;
    @Reference(version = "1.0.0")
    private  dictionaryItemSevice dictionaryItemSevice;

    /**
     * 楼宇列表页面
     * @return
     */
    @RequestMapping("buildingList.html")
    public  String buildingList(){
        return "dataCenter/community/BuildingManagement/buildingList";
    }

    /**
     * 添加楼宇页面
     */
    @RequestMapping("addBuildingList.html")
    public String addBuildingList(){
        return "dataCenter/community/BuildingManagement/addBuilding";
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
    @RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
    @ResponseBody
    public int deleteByPrimaryKey(long id){
        return buildingService.deleteByPrimaryKey(id);
    }

    /**
     * 添加楼宇
     * @param record
     * @return
     */
    @RequestMapping("buildingInsert")
    @ResponseBody
    public int insert(Building record) {
        return buildingService.insert(record);
    }

    /**
     * 查询小区 id 名称
     */
    @RequestMapping("getCommunityIdAndName")
    @ResponseBody
    public List<Community> getCommunityIdAndName(){
        return communityService.getCommunityIdAndName();
    }

    /**
     * 查询楼宇类型为高层底层，别墅的
     */
    @RequestMapping("typeID")
    @ResponseBody
   public List<DictionaryItem> getDictionary(){
        return dictionaryItemSevice.getDictionary();
    }
}
