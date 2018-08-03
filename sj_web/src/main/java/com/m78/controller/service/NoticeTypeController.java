package com.m78.controller.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.Noticetype;
import com.m78.service.service.NoticeTypeService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    /**
     * 获取所有公告类型
     * @return
     */
    @RequestMapping("getAllNoticeType.json")
    @ResponseBody
    public List<Noticetype> getAllNoticeType(){
     return noticeTypeService.getAllNoticeType();
    }

    /**
     * 添加公告类型
     * @return
     */
    @RequestMapping("addNoticeType.json")
    @ResponseBody
    public  Object addNoticeType(@RequestParam("typeName") String typeName){
        return  noticeTypeService.addNoticeType(typeName);
    }

    /**
     * 获取所有公告（分页）
     * @return
     */
    @RequestMapping("getAllNoticeByPage.json")
    @ResponseBody
    public  Object getAllNoticeTypeByPage(@RequestParam("typeName")String typeName,@RequestParam("page") int page,
                                          @RequestParam("limit") int limit){
        return DataTable.bindTableUtil(0,noticeTypeService.getAllNoticeTypeCount(typeName),noticeTypeService
        .getAllNoticeTypeByPage(typeName,page,limit));

    }

    /**
     * 根据id删除公告类型
     * @return
     */
    @RequestMapping("deleteNoticeTypeById.json")
    @ResponseBody
    public  Object deleteNoticeTypeById(@RequestParam("noticeTypeId") Long noticeTypeId){
         return  noticeTypeService.deleteNoticeType(noticeTypeId);
    }
}
