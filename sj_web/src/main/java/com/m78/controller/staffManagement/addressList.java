package com.m78.controller.staffManagement;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 通讯录
 */
@RequestMapping("addressBook")
public class addressList {

    @Reference(version = "1.0.0")

    /**
     * 员工列表
     */
    @RequestMapping("addressList")
    public String addressList(){
        return "staffManagement/addressList";
    }
}
