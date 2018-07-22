package com.m78.controller.staffManagement;


import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.Department;
import com.m78.entity.DictionaryItem;
import com.m78.entity.Staff;
import com.m78.util.DataTable;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "staffManagement/addressList/addressList";
    }

    /**
     * 员工信息
     */
    @GetMapping("getstaff.json")
    @ResponseBody
    public Object getStaff(@RequestParam("page") int page, @RequestParam("limit") int limit, @RequestParam("name") String name){
        return DataTable.bindTableUtil(0,staffService.getStaffNumber(),staffService.getStaff(page, limit, name));
    }

    /**
     * 员工信息
     */
    @RequestMapping("asd")
    @ResponseBody
    public List<Staff> getPersonal() {
        return staffService.getPersonal();
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
    @RequestMapping("AddNewEmployees.html")
    public String addstaff(){
        return "staffManagement/addressList/AddNewEmployees";
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
    public List<DictionaryItem> getDictionaryItem(Model model){
        List<DictionaryItem> list =dictionaryItemSevice.getDictionaryItem();
        model.addAttribute("dictionary",list);
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

    /**
     * 修改人员信息页面
     */
    @RequestMapping(value = "updateNewEmployees.html")
    public String updateSatff(@RequestParam("id") int id, Model model){
        Staff staff=staffService.getStaffId(id);
        model.addAttribute("staff",staff);
        return "staffManagement/addressList/updateNewEmployees";
    }
    @RequestMapping(value = "sss")
    public String ss(){
        return "staffManagement/addressList/updateNewEmployees";
    }
}