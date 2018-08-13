package com.m78.controller;

import com.m78.entity.User;
import com.m78.util.MyDES;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

@Controller
public class IndexController {

    /**
     * 跳转首页456
     * @return
     */
    @RequestMapping("doIndex")
    public  Object doIndex(){
        return  "index";
    }

    /**
     * 跳转首页456
     * @return
     */
    @RequestMapping("demo")
    public  Object demo(){
        return  "demo";
    }

    /**
     * 跳转登录
     * @return
     */
    @RequestMapping("doLogin")
    public  String doLogin(){
        return "login";
    }


    /**
     * 登录操作
     * @return
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public  String login(User user, Model model){
        //获取主体
        Subject subject=SecurityUtils.getSubject();
       user.setPassword(MyDES.encryptBasedDes(user.getPassword()));
        //创建token
        UsernamePasswordToken token=new UsernamePasswordToken(user.getName(),user.getPassword());
        try {
            model.addAttribute("user",user);
            subject.login(token);
            return  "0";
        }catch(IncorrectCredentialsException e){
            return "1";
        } catch (AuthenticationException e) {
            return "2";
        }

    }

    /**
     * 跳转未授权页面
     * @return
     */
    @RequestMapping("/nopermission")
    public  Object doNoPerssion(){
       return  "nopermission";
    }

}
