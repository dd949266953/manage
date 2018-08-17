package com.m78.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 权限管理
 */
@RestController
@RequestMapping("permission")
public class PermissionController {
    /**
     * 跳转到权限管理 管理人员的主页面
     * @return
     */
    @GetMapping("doPermission")
    public ModelAndView doPermission(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("user/permissions");
        return modelAndView;
    }
    /**
     * 跳转到添加管理员界面
     * @return
     */
    @GetMapping("doAddAdmin")
    public ModelAndView doAddAdmin(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("user/addAdmin");
        return modelAndView;
    }

}
