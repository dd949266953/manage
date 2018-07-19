package com.m78.controller.bill;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.Chargeitem;
import com.m78.entity.Chargename;
import com.m78.service.bill.ChargenNameService;
import com.m78.util.DataTable;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
     * 下拉框显示
     * @return
     */
    @RequestMapping("getCharName.json")
    @ResponseBody
    public List<Chargename> getCharName(){
        return  chargenNameService.getCharName();
    }

    /**
     * 添加公式
     * @return
     */
    @RequestMapping("addCharItem")
    @ResponseBody
    public  int addCharItem(Chargeitem chargeitem){
        return  chargenNameService.addCharTtem(chargeitem);
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

    /**
     * 跳转到公式列表
     * @return
     */
    @RequestMapping("doCharItem/{id}")
    public  Object doCharItem(@PathVariable("id")int id, HttpServletRequest request){
        request.setAttribute("id",id);
        return  "bill/charitem";
    }

    /**
     * 获取所有公式
     * @return
     */
    @RequestMapping("getAllCharitem.json")
    @ResponseBody
    public  Object getAllCharItem(@RequestParam("page")int page,@RequestParam("limit") int pageSize,@RequestParam("id")int id){
       return  DataTable.bindTableUtil(0,chargenNameService.getAllCount(id),chargenNameService.getAllById(page,pageSize,id));
    }

    /**
     * 删除公式byid
     * @return
     */
    @RequestMapping("deleteCharItemById.json")
    @ResponseBody
    public  Object deleteCharItem(@RequestParam("id") Long id){
        int num=0;
        try {
            num=  chargenNameService.deleteCharItem(id);
            return  num;
        } catch (Exception e) {
            return  num;
        }
    }

    /**
     * 跳转添加公式
     * @return
     */
    @RequestMapping("doAddItem")
    public  Object doAddItem(){
        return "bill/addItem";
    }


}
