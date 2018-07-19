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

    /**
     * 根据住户姓名查询住户详细住址
     * @param name
     * @return
     */
    @RequestMapping("getDetailAddressByName.json")
    @ResponseBody
    public Object getDetailAddressByName(@RequestParam("name") String name,@RequestParam("page") int page,@RequestParam("limit") int limit){
        return DataTable.bindTableUtil(0,tenementService.getAllCount(name),tenementService.getDetailAddressByName(name,page,limit));
    }

    /**
     * 根据电话查询房屋id
     * @param phone
     * @return
     */
    @RequestMapping("getHouseIdByTenementPhone")
    @ResponseBody
    public Long getHouseIdByTenementPhone(String phone) {
        return tenementService.getHouseIdByTenementPhone("15721234121");
    }

    /**
     * 根据电话查询车位id
     * @param phone
     * @return
     */
    @RequestMapping("getCarportIdByTenementPhone")
    @ResponseBody
    public Long getCarportIdByTenementPhone(String phone) {
        return tenementService.getCarportIdByTenementPhone(phone);
    }
}
