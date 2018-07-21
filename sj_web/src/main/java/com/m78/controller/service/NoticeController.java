package com.m78.controller.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.service.NoticeService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 公告
 */
@Controller
@RequestMapping("notice")
public class NoticeController {


    @Reference(version = "1.0.0")
    private NoticeService noticeService;

    /**
     * 跳转公告列表
     * @return
     */
    @RequestMapping("doNotice")
    public  Object doNotice(){
        return  "service/notice/noticeList";
    }

    /**
     * 跳转添加公告
     * @return
     */
    @RequestMapping("doAddNotice")
    public  Object doAddNotice(){
        return  "service/notice/addNotice";
    }

    /**
     * 获取所有公告
     * @return
     */
    @RequestMapping("getAllNotice.json")
    @ResponseBody
    public  Object getAllNotice(@RequestParam("page") int page,@RequestParam("limit") int limit
                                ,@RequestParam("noticeName") String noticeName){
        return DataTable.bindTableUtil(0,noticeService.getAllNoticeCount(noticeName)
                                       ,noticeService.getAllNotice(noticeName,page,limit));

    }



}
