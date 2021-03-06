package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;

import com.m78.entity.Building;
import com.m78.service.dataCenter.CommunityService;
import com.m78.service.dataCenter.BuildingService;
import com.m78.util.DataTable;
import com.m78.vo.BuildingVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 楼宇
 */
@RequestMapping("/Building")
@Controller
public class BuildingController {
    @Reference(version = "1.0.0")
    private BuildingService buildingService;

    @Reference(version = "1.0.0")
    private CommunityService communityService;


    /**
     * 楼宇列表页面
     *
     * @return
     */
    @RequestMapping("buildingList.html")
    public String buildingList() {
        return "dataCenter/building/buildingList";
    }

    /**
     * 添加楼宇页面
     */
    @RequestMapping(value = {"addBuilding.html", "updateBuilding.html"})
    public ModelAndView addBuilding(BuildingVo building) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("building", building);
        mv.addObject("buildingType", buildingService.getBuildingType());
        mv.addObject("community",communityService.getCommunityIdAndName());
        mv.setViewName("dataCenter/building/addBuilding");
        return mv;
    }

    /**
     * 楼宇列表数据
     *
     * @return
     */
    @RequestMapping("getBuilldingList")
    @ResponseBody
    public Object getBuildingList(@RequestParam("page") int page,
                                  @RequestParam("limit") int limit,
                                  @RequestParam("buildingName") String buildingName) {
        return DataTable.bindTableUtil(0, buildingService.getBuildingCountByName(buildingName), buildingService.getBuildingList(page, limit, buildingName));
    }

    /**
     * 根据id修改楼宇
     *
     * @param record
     * @return
     */
    @RequestMapping("updateBuilding/{id}")
    @ResponseBody
    public int updateByPrimaryKeySelective(@PathVariable("id") Long id, Building record) {
        record.setId(id);
        return buildingService.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据id删除
     */
    @RequestMapping(value = "deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(long id) {
        return buildingService.deleteByPrimaryKey(id);
    }

    /**
     * 添加楼宇
     *
     * @param record
     * @return
     */
    @RequestMapping("addBuilding")
    @ResponseBody
    public int insert(BuildingVo record) {
        return buildingService.insert(record);
    }

}
