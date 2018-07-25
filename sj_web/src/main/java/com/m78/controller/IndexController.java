package com.m78.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
