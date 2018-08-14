package com.m78.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.staff.UserService;
import com.m78.util.DataTable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 员工管理
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Reference
    private UserService userService;

    /**
     * 跳转员工页面
     * @return
     */
    @RequestMapping("doUserList")
    public  ModelAndView  doUserList(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("user/userList");
        return  modelAndView;
    }
    /**
     * 跳转添加员工页面
     * @return
     */
    @RequestMapping("doAddUser")
    public  ModelAndView  doAddUser(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("user/addUser");
        return  modelAndView;
    }

    /**
     * 根据名称获取所有员工信息
     * @return
     */
    @GetMapping("getAllUserMessage")
    public Object getAllUserByName(@RequestParam("page")int page,@RequestParam("limit") int limit,
                                   @RequestParam("userName") String userName){
        return DataTable.bindTableUtil(0,userService.getAllCount(userName),userService.getAllUserByName(page,limit,userName));
    }

    /**
     * 删除员工信息
     * @return
     */
    @DeleteMapping("deleteUserMessage")
    public  int deleteUserMessage(@RequestParam("userId") Long userId){
        return  userService.deleteUser(userId);
    }




}
