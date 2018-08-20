package com.m78.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.UserPermission;
import com.m78.service.staff.SetPermissionService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 权限管理
 */
@RestController
@RequestMapping("permission")
public class PermissionController {

    @Reference
    private SetPermissionService setPermissionService;

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
    /**
     * 跳转到设置权限界面
     * @return
     */
    @GetMapping("doSetPermissions/{id}")
    public ModelAndView doSetPermissions(@PathVariable("id") Long id){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("user/setPermission");
        modelAndView.addObject("adminId",id);
        return modelAndView;
    }

    /**
     *添加权限
     * @return
     */
    @RequestMapping("addPermission")
    public int addPermission(UserPermission userPermission){
      return  setPermissionService.addPermission(userPermission);
    }

    /**
     * 根据用户id和权限id删除
     * @return
     */
    @RequestMapping("deletePermission")
    public  int  deletePermission(@RequestParam("userid") Long userId,@RequestParam("permissionid") Long permissionId){
             return  setPermissionService.deletePermission(userId,permissionId);
    }

    /**
     * 查询已拥有的权限
     * @return
     */
    @RequestMapping("getPermission")
    public  Object getPermission(@RequestParam("userId") Long userId) {
      return  setPermissionService.getPermissionByUserId(userId);
    }
}
