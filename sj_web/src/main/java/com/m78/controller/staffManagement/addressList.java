package com.m78.controller.staffManagement;


import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.Department;
import com.m78.entity.DictionaryItem;
import com.m78.entity.Staff;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.m78.service.staff.staffService;
import com.m78.service.dictionaryItemSevice;

import java.util.List;

/**
 * 通讯录
 */
@RequestMapping("addressBook")
@Controller
public class addressList {

    @Reference(version = "1.0.0")
    private staffService staffService;
    @Reference(version = "1.0.0")
    private dictionaryItemSevice dictionaryItemSevice;


    /**
     * 查询人员数量
     */
    @RequestMapping("getStaffNumber")
    @ResponseBody
    public Long getStaffNumber(){
      return  staffService.getStaffNumber();
    }

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
    @RequestMapping("getstaff.json")
    @ResponseBody
    public Object getStaff(@RequestParam("page") int page, @RequestParam("limit") int limit, @RequestParam("name") String name){
        return DataTable.bindTableUtil(0,staffService.getStaffNumber(),staffService.getStaff(page, limit, name));
    }
    /**
     * 删除员工
     */
    @RequestMapping(value = "delStaff", method = RequestMethod.GET)
    @ResponseBody
    public int deleteByPrimaryKey(long id){
        return staffService.deleteByPrimaryKey(id);
    }
    /**
     * 添加人员
     */
    @RequestMapping("addstaff.html")
    public String addstaff(){
        return "staffManagement/addressList/addstaff";
    }
    /**
     * 查询部门信息
     */
    @RequestMapping("getDepartment")
    @ResponseBody
    public List<Department> getDepartment(){
       return dictionaryItemSevice.getDepartment();
    }
    /**
     * 查询职业类型
     */
    @RequestMapping("getDictionaryItem")
    @ResponseBody
    public List<DictionaryItem> getDictionaryItem(){
        return dictionaryItemSevice.getDictionaryItem();
    }
    /**
     * 添加员工
     */
    @RequestMapping(value = "addStaffMessage",method = RequestMethod.POST)
    @ResponseBody
    public int insert(Staff record) {
        return staffService.insert(record);
    }
}