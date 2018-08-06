package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.Community;
import com.m78.entity.Tenement;
import com.m78.service.dataCenter.CommunityService;
import com.m78.service.dataCenter.TenementService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("Tenement")
@Controller
public class TenementController {
    @Reference(version="1.0.0")
    private TenementService tenementService;

    @Reference(version="1.0.0")
    private CommunityService communityService;
    /**
     * 住户列表界面
     * @return
     */
    @RequestMapping("/tenementList.html")
    public String houseList(){
        return "dataCenter/tenement/tenementList";
    }


    /**
     * 添加/修改界面
     * @return
     */
    @RequestMapping(value = {"addTenement.html","updateTenement.html"})
    public Object updateTenementView(@RequestParam(value = "tenementId",required = false)Long tenementId){
        ModelAndView mv=new ModelAndView();
        //小区列表
        System.out.println(tenementId);
        mv.addObject("tenementId",tenementId);
        mv.addObject("communityList",communityService.getCommunityIdAndName());
        if (tenementId==null){
            //添加

        }else {
            //修改
            mv.addObject("tenement",tenementService.getTenementByPrimaryKeyId(tenementId));
        }
        mv.setViewName("dataCenter/tenement/addTenement");
        return mv;
    }
    /**
     * 根据主键id查询住户详情
     * @param id
     * @return
     */
    @RequestMapping("getTenementByPrimaryKey")
    @ResponseBody
    public Object getTenementByPrimaryKeyId(Long id){
        return tenementService.getTenementByPrimaryKeyId(id);
    }

    /**
     * 根据主键id删除 住户
     * @param id
     * @return
     */
    @RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
    @ResponseBody
    public int deleteByPrimaryKey(Long id){
        return tenementService.deleteByPrimaryKey(id);
    }

    /**
     * 获取所有住户 根据住户姓名 模糊查询
     * @return
     */
    @RequestMapping("/getAllTenement")
    @ResponseBody
    public Object getAllTenement(@RequestParam("name")String name,@RequestParam("page")int page,@RequestParam("limit")int limit){
        return DataTable.bindTableUtil(0, tenementService.getTenementCount(name),tenementService.getAllTenement(name,page,limit));
    }

    /**
     * 根据住户姓名获取住户详细住址
     * @return
     */
    @RequestMapping("/getDetailAddressByName")
    @ResponseBody
    public Object getDetailAddressByName(@RequestParam("tenementName")String tenementName,@RequestParam("page") int page,@RequestParam("limit") int limit){
        return DataTable.bindTableUtil(0,tenementService.getTenementCountByName(tenementName),tenementService.getDetailAddressByName(tenementName,page,limit));
    }

    /**
     * 根据住户姓名查询住户总数
     * @return
     */
    @RequestMapping("/getTenementCountByName")
    @ResponseBody
    public Object getTenementCountByName(@RequestParam("tenementName")String tenementName) {
        return tenementService.getTenementCountByName(tenementName);
    }
    /**
     * 根据住户手机号查询车位主键
     * @param phone
     * @return
     */
    @RequestMapping("/getCarportIdByTenementPhone")
    @ResponseBody
    public Object getCarportIdByTenementPhone(String phone) {
        return tenementService.getCarportIdByTenementPhone(phone);
    }

    /**
     * 根据住户手机号查询房屋主键
     * @param phone
     * @return
     */
    @RequestMapping("/getHouseIdByTenementPhone")
    @ResponseBody
    public Object getHouseIdByTenementPhone(String phone) {
        return tenementService.getHouseIdByTenementPhone(phone);
    }
}
