package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.dataCenter.TenementService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("Tenement")
@Controller
public class TenementController {
    @Reference(version="1.0.0")
    private TenementService tenementService;

    /**
     * 获取所有住户
     * @return
     */
    @RequestMapping("getAllTenement")
    @ResponseBody
    public Object getAllTenement(){
        return  tenementService.getAllTenement();
    }

    /**
     * 根据住户姓名获取住户详细住址
     * @return
     */
    @RequestMapping("getDetailAddressByName")
    @ResponseBody
    public Object getDetailAddressByName(@RequestParam("tenementName")String tenementName,@RequestParam("page") int page,@RequestParam("limit") int limit){
        return DataTable.bindTableUtil(0,tenementService.getTenementCountByName(tenementName),tenementService.getDetailAddressByName(tenementName,page,limit));
    }

    /**
     * 根据住户姓名查询住户总数
     * @return
     */
    @RequestMapping("getTenementCountByName")
    @ResponseBody
    public Object getTenementCountByName(@RequestParam("tenementName")String tenementName) {
        return tenementService.getTenementCountByName(tenementName);
    }

    /**
     * 根据住户手机号查询车位主键
     * @param phone
     * @return
     */
    @RequestMapping("getCarportIdByTenementPhone")
    @ResponseBody
    public Object getCarportIdByTenementPhone(String phone) {
        return tenementService.getCarportIdByTenementPhone(phone);
    }

    /**
     * 根据住户手机号查询房屋主键
     * @param phone
     * @return
     */
    @RequestMapping("getHouseIdByTenementPhone")
    @ResponseBody
    public Object getHouseIdByTenementPhone(String phone) {
        return tenementService.getHouseIdByTenementPhone(phone);
    }
}
