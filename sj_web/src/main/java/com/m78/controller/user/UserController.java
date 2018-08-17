package com.m78.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.User;
import com.m78.service.staff.UserService;
import com.m78.util.DataTable;
import com.m78.util.MyDES;
import org.apache.shiro.SecurityUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
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
    public Object getAllUserByName(@RequestParam("page")int page, @RequestParam("limit") int limit,
                                   @RequestParam("userName") String userName, @RequestParam(value = "admin",required = false) String admin,
                                   HttpSession session){
        Long id=(Long)SecurityUtils.getSubject().getPrincipal();
        return DataTable.bindTableUtil(0,userService.getAllCount(userName,admin,id),userService.getAllUserByName(page,limit,userName,admin,id));
    }

    /**
     * 删除员工信息
     * @return
     */
    @RequestMapping("deleteUserMessage")
    public  int deleteUserMessage(@RequestParam("userId") Long userId){
        return  userService.deleteUser(userId);
    }

    /**
     * 添加员工
     * @return
     */
    @GetMapping("addUserMessage")
   public  int addUser(@Valid User user, BindingResult bindingResult){
        System.out.println(user.toString());
        return  userService.addUser(user);
   }

    /**
     * 根据部门id查询员工信息
     * @return
     */
    @GetMapping("getUserByDepartmentId")
   public  Object getUserByDepartmentId(@RequestParam("departmentId") Long departmentId,HttpSession session){
         Long id=(Long) SecurityUtils.getSubject().getPrincipal();
        return  userService.getUserByDepartmentId(departmentId,id);
   }

    /**
     * 根据id更新密码
     * @param userId
     * @param password
     * @return
     */
    @RequestMapping("updateAdminPassword")
   public  Object updatePasswordById(@RequestParam("userId") Long userId,@RequestParam("password") String password){
         String loginPassowrd= MyDES.encryptBasedDes(password);
         return  userService.updatePasswordById(loginPassowrd,userId);
   }


}
