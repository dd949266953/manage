package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.Community;
import com.m78.service.dataCenter.CommunityService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 小区
 */
@RequestMapping("Community")
@Controller
public class CommunityController {

    @Reference(version="1.0.0")
    private CommunityService communityService;

    /**
     * 查询界面
     * @return
     */

    @RequestMapping("communityList.html")
    public String CommunityList(){
        return "dataCenter/community/community";
    }

    /**
     * 添加界面
     * @return
     */
    @RequestMapping(value = "addCommunity.html", method = RequestMethod.GET)
    public String addCommunity(){
        return "dataCenter/community/addCommunity";
    }

    /**
     * 查询界面数据
     * @return
     */
    @RequestMapping(value = "/communityData")
    @ResponseBody
    public  Object  findAllCommunity(@RequestParam("page") int page, @RequestParam("limit") int limit,@RequestParam("communityName") String communityName){
        System.out.println(communityName);
        return  DataTable.bindTableUtil(0,100,communityService.findAll(page,limit,communityName));
    }

    /**
     * 添加小区
     */
    @RequestMapping("addCommunitydata")
    @ResponseBody
    public int insertCommunity(Community record){
        return  communityService.insert(record);
    }

    /**
     * 删除小区
     */
    @RequestMapping(value = "deleteCommunity",method = RequestMethod.GET)
    @ResponseBody
    public int delCommunity(long id){
        return  communityService.deleteByPrimaryKey((long)id);
    }

    /**
     * 查询小区 id 名称
     */
    @RequestMapping("getCommunityIdAndName")
    @ResponseBody
    public List<Community> getCommunityIdAndName(){
        return communityService.getCommunityIdAndName();
    }


}
