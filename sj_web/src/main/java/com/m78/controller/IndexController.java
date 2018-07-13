package com.m78.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /**
     * 跳转首页123
     * @return
     */
    @RequestMapping("doIndex")
    public  Object doIndex(){
        return  "index";
    }

}
