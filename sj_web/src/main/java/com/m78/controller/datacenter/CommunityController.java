package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.Community;
import com.m78.service.CommunityService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("Community")
@Controller
public class CommunityController {
    @Reference(version="1.0.0")
    private CommunityService communityService;

    /**
     * 查询界面111111111ewqe
     * @return
     */
    @RequestMapping("Communitylist")
    public String CommunityList(){
        return "datacenter/community/community";
    }

    /**
     * 查询界面数据
     * @return
     */
    @RequestMapping(value = "communityData")
    @ResponseBody
    public  Object  FindCommunity(){
        return  DataTable.bindTableUtil(0,100,communityService.findAll());
    }


    /**
     * 添加界面123234132
     * @return
     */
    @RequestMapping(value = "addCommunity", method = RequestMethod.GET)
    public String addCommunity(){
        return "datacenter/addCommunity";
    }

    /**
     * 添加小区
     */
    @RequestMapping("addCommunitydata")
    public int insertCommunity(Community record){
        return  communityService.insert(record);
    }
    /**
     * 删除小区
     */
    @RequestMapping(value = "daleteCommunity",method = RequestMethod.GET)
    @ResponseBody
    public int delCommunity(long id){
        return  communityService.deleteByPrimaryKey((long) id);
    }

    /**
     * 房屋列表11213
     * @return
     */
    @RequestMapping("houstList")
    public String houstList(){
        return "datacenter/community/houseList";
    }
}
