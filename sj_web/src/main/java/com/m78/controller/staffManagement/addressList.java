package com.m78.controller.staffManagement;


import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.m78.service.staff.staffService;
/**
 * 通讯录
 */
@RequestMapping("addressBook")
@Controller
public class addressList {

    @Reference(version = "1.0.0")
    private staffService staffService;
    /**
     * 员工列表
     */
    @RequestMapping("addressList.html")
    public String addressList(){
        return "staffManagement/addressList/addressBook";
    }

    /**
     * 员工信息
     */
    @RequestMapping("getstaff")
    @ResponseBody
    public Object getStaff(){
        return DataTable.bindTableUtil(0,100,staffService.getStaff());
    }
    /**
     * 删除员工
     */
    @RequestMapping(value = "delStaff", method = RequestMethod.GET)
    @ResponseBody
    public int deleteByPrimaryKey(long Id){
        return staffService.deleteByPrimaryKey(Id);
    }
}