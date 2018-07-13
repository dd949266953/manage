package com.m78.controller.bill;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.Bill;
import com.m78.service.bill.BillService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("bill")
public class BillController {

    @Reference(version = "1.0.0")
    private BillService billService;

    /**
     * 首页跳转未缴账单页面
     * @return
     */
    @RequestMapping("doNoBill")
    public  Object doNoBill(){
        return  "bill/Nobills";
    }

    @RequestMapping("getAllNoBill.json")
    @ResponseBody
    public Object getAllNoBill(@RequestParam("page") int page,@RequestParam("limit") int limit){
        int pageSize=(page-1)*limit;
        return DataTable.bindTableUtil(0,billService.getAllNoBillCount(),billService.getAllNoBill(page,pageSize));
    }

}
