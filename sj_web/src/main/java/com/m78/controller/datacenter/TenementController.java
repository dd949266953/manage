package com.m78.controller.datacenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.dataCenter.TenementService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("Tenement")
@Controller
public class TenementController {
    @Reference(version="1.0.0")
    private TenementService tenementService;

    @RequestMapping("getAll")
    @ResponseBody
    public Object getAllTenement(){
        return tenementService.getAllTenement();
    }
}
