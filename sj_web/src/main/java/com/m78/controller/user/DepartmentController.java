package com.m78.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.staff.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 部门管理
 */
@RestController
@RequestMapping("department")
public class DepartmentController {

     @Reference
     private DepartmentService departmentService;

    /**
     * 获取所有部门信息
     * @return
     */
    @GetMapping("getAllDepartment")
     public  Object getAllDepartment(){
        return departmentService.getAllDeparment();
    }

    /**
     * 获取所有职位类型
     * @return
     */
    @GetMapping("getAllUserOption")
    public  Object getAllUserOption(){
      return  departmentService.getUserOption();
    }

}
