package com.m78.controller.bill;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.Bill;
import com.m78.service.bill.BillService;
import com.m78.util.DataTable;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.swing.filechooser.FileSystemView;
import java.awt.print.Book;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
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

    /**
     * 首页跳转已缴账单页面
     * @return
     */
    @RequestMapping("doYseBill")
    public  Object doYseBill(){
        return  "bill/YseBills";
    }

    /**
     * 跳转到添加账单页面
     * @return
     */
    @RequestMapping("doAddBill")
    public Object doAddBill(){
        return  "bill/addbill";
    }

    /**
     * 跳转到通知页面
     * @return
     */
    @RequestMapping("doNotice")
    public  Object doNotice(){
        return  "bill/notice";
    }

    /**
     * 获取全部未缴账单
     * @param page
     * @param limit
     * @param name 条件
     * @return
     */
    @RequestMapping("getAllNoBill.json")
    @ResponseBody
    public Object getAllNoBill(@RequestParam("page") int page,@RequestParam("limit") int limit,@RequestParam("name") String name){
        return DataTable.bindTableUtil(0,billService.getAllNoBillCount(),billService.getAllNoBill(page,limit,name));
    }

    /**
     * 导出账单
     * @return
     */
    @RequestMapping("export.json")
    @ResponseBody
    public  Object export(@RequestParam("name") String name) {
        List<Bill> list = billService.getAllNoBill(-1, -1, name);
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File com = fsv.getHomeDirectory();
        String path = com.getPath()+"/wxq.xls";
        WritableWorkbook book = null;
        Label tempLabel = null;
        try {
            book = Workbook.createWorkbook(new File(path));
            WritableSheet sheet = book.createSheet("微小区账单", 0);
            //表头输出
            String header = "收费项,类型,小区,房号/车位号,开始时间,结束时间,住户,单价,耗损,总金额";
            String[] headerArr = header.split(",");
            int headerLen = headerArr.length;
            //循环写入表头内容
            for (int i = 0; i < headerLen; i++) {
                tempLabel = new Label(0+ i, 1, headerArr[i]);
                sheet.addCell(tempLabel);
            }
            for (int i = 0; i < list.size(); i++) {
                Bill bill = list.get(i);
                String types = "";
                if (bill.getType() == 1) {
                    types = "房屋";
                } else {
                    types = "车位";
                }
                Label label1 = new Label(0, i+2, bill.getCharName());
                Label label2 = new Label(1, i+2, types);
                Label label3 = new Label(2, i+2, bill.getCommunity().getName());
                Label label4 = new Label(3, i+2, String.valueOf(bill.getSignId()));
                Label label5 = new Label(4, i+2, String.valueOf(bill.getStarttime()));
                Label label6 = new Label(5, i+2, String.valueOf(bill.getOvertime()));
                Label label7 = new Label(6, i+2, bill.getTentmentName());
                Label label8 = new Label(7, i+2, String.valueOf(bill.getPrice()));
                Label label9 = new Label(8, i+2, String.valueOf(bill.getConsume()));
                Label label10 = new Label(9, i+2, String.valueOf(bill.getMoneys()));
                sheet.addCell(label1);
                sheet.addCell(label2);
                sheet.addCell(label3);
                sheet.addCell(label4);
                sheet.addCell(label5);
                sheet.addCell(label6);
                sheet.addCell(label7);
                sheet.addCell(label8);
                sheet.addCell(label9);
                sheet.addCell(label10);

            }
            // 写入目标路径
            book.write();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            try {
                book.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    /**
     * 根据id删除账单
     * @return
     */
    @RequestMapping("deleteBillById.json")
    @ResponseBody
    public  int deleteBillById(@RequestParam("billId") long id){
       return  billService.deleteBillById(id);
    }

    /**
     * 更新未缴账单为已收费
     * @return
     */
    @RequestMapping("updateBillById.json")
    @ResponseBody
    public  Object updateBillById(@RequestParam("billId") Long billlId){
        return  billService.updateBillById(billlId);
    }

    /**
     * 获取所有已缴费账单
     * @return
     */
    @RequestMapping("getAllYseBills.json")
    @ResponseBody
    public  Object getAllYseBills(@RequestParam("page") int page,@RequestParam("limit") int limit,@RequestParam("name") String name){
        return  DataTable.bindTableUtil(0,billService.getAllYseBillCount(),billService.getAllYseBills(page,limit,name));
    }

    /**
     * 批量删除
     * @return
     */
    @RequestMapping("deletePiLiangBill.json")
    @ResponseBody
    public  Object deletePiLiangBill(@RequestParam("billIds") Long[] bills) {
         return  billService.deletePiLiangBill(bills);
    }

    /**
     * 获取所有通知的账单数据
     * @return
     */
    @RequestMapping("getAllSend.json")
    @ResponseBody
    public  Object getAllSendBill(@RequestParam("page") int page,@RequestParam("limit") int limit,@RequestParam("name") String name){
        return  DataTable.bindTableUtil(0,billService.getAllSendCount(),billService.getAllSend(page,limit,name));
    }

}
