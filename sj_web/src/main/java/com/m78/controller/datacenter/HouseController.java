package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.House;
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
    @RequestMapping(value = {"addHouse.html","updateHouse.html"})
    public Object addHouse(@RequestParam(value = "houseId",required = false)String houseId){
        System.out.println(houseId);
        ModelAndView mv=new ModelAndView();
        mv.addObject("houseId",houseId);
        //所有小区id和名称
        mv.addObject("communityList",communityService.getCommunityIdAndName());
        //所有房屋类型
        mv.addObject("houseType",houseService.getHouseType());
        //所有房屋状态
        mv.addObject("houseState",houseService.getHouseState());
        mv.setViewName("dataCenter/house/addHouse");
        return mv;
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
        return DataTable.bindTableUtil(0, houseService.getHouseCountByName(Long.valueOf(houseName)), houseService.getAllHouse(houseName, page, limit));
    }

    /**
     * 查询楼宇id和名称根据小区id
     * @param communityId
     * @return
     */
    @RequestMapping("/getBuildingIdAndNameByCommunityId")
    @ResponseBody
    public Object getBuildingIdAndNameByCommunityId(@RequestParam("communityId") Long communityId){
        return buildingService.getBuildingIdAndNameByCommunityId(communityId);
    }

    /**
     * 查询单元总数根据楼宇id
     */
    @RequestMapping("/getUnitTotalByBuildingId")
    @ResponseBody
    public Long getUnitTotalByBuildingId(Long buildingId) {
        return buildingService.getUnitTotalByBuildingId(buildingId);
    }
    /**
     * 查询楼层总数根据楼宇id
     * @return
     */
    @RequestMapping("/getBuildingPliesById")
    @ResponseBody
    public Long getBuildingPliesById(Long buildingId) {
        return buildingService.getBuildingPliesById(buildingId);
    }

    /**
     * 添加房屋
     * @return
     */
    @RequestMapping("/insertHouse")
    @ResponseBody
    public int insertHouse(Long buildingId, House house) {
        return houseService.insertHouse(buildingId,house);
    }

    /**
     * 根据主键删除
     * @return
     */
    @RequestMapping("/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(Long houseId){
        return houseService.deleteByPrimaryKey(houseId);
    }
}
