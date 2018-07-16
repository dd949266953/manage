package com.m78.controller.bill;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.bill.ChargenNameService;
import com.m78.util.DataTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 收费项
 */
@Controller
@RequestMapping("chargenName")
public class ChargenNameController {

    @Reference(version = "1.0.0")
    private ChargenNameService chargenNameService;


    /**
     * 跳转到收费项
     * @return
     */
    @RequestMapping("doChargingItem")
    public  Object doChargingItem(){
        return  "bill/chargingItem";
    }

    /**
     * 获取所有收费项
     * @return
     */
    @RequestMapping("getAllCharName.json")
    @ResponseBody
    public  Object getAllCharName(@RequestParam("page") int page, @RequestParam("limit") int limit,@RequestParam("name")String name){
        return DataTable.bindTableUtil(0,chargenNameService.getAllCount(name),chargenNameService.getAllCharName(page,limit,name));
    }

    /**
     * 添加收费项
     * @return
     */
    @RequestMapping("addChargenName.json")
    @ResponseBody
    public  Object addChargenName(@RequestParam("chargenName") String name){
        return  chargenNameService.addChargenName(name);
    }

    /**
     * 删除收费项
     * @return
     */
    @RequestMapping("deleteChargenById.json")
    @ResponseBody
    public  Object deleteChargenName(@RequestParam("chargenNameId")Long id){
            int num=0;
            try {
                 num=chargenNameService.deleteChargenName(id);
            }catch (Exception e){
                 num=0;
            }
            return  num;
    }


}
