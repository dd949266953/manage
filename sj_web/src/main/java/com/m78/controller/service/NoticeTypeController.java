package com.m78.controller.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.service.NoticeTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公告类型
 */
@Controller
@RequestMapping("noticeType")
public class NoticeTypeController {

    @Reference(version = "1.0.0")
    private NoticeTypeService noticeTypeService;

    /**
     * 跳转到公告页面
     * @return
     */
    @RequestMapping("doNoticeType")
    public  Object doNoticeType(){
        return  "service/notice/noticeType";
    }
}
