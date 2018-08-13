package com.m78.controller.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.Community;
import com.m78.service.dataCenter.CommunityService;
import com.m78.service.service.NoticeService;
import com.m78.util.DataTable;
import com.m78.util.upload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 公告
 */
@Controller
@RequestMapping("notice")
public class NoticeController {


    @Reference(version = "1.0.0")
    private NoticeService noticeService;
    @Reference(version = "1.0.0")
    private CommunityService communityService;

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
     * 跳转到选择小区
     * @return
     */
    @RequestMapping("doRightCommunity/{id}")
    public  Object doRightCommunity(@PathVariable("id") Long id, Model model){
        List<Community> communityList=communityService.getCommunityIdAndName();
        model.addAttribute("communityList",communityList);
        model.addAttribute("noticeId",id);
           return "RightCommunity";
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

    /**
     * 添加公告
     * @param
     * @param content 内容（文字或图片）
     * @param level 是否置顶
     * @return
     */
    @RequestMapping("addNotice.json")
    @ResponseBody
    public  Object addNotice(@RequestParam("noticeName")String noticeName,
                              @RequestParam("type") Long type,@RequestParam("content")
                             String content,@RequestParam("level") Long level,
                             @RequestParam("img") String img){


        return  noticeService.addNotice(noticeName,type,content,img,level);


    }

    /**
     * 上传图片
     * @param file
     * @return
     */
    @RequestMapping("upload")
    @ResponseBody
    public Object uploadimg(@RequestParam("file") MultipartFile file){
        try {
            String fileName = file.getOriginalFilename();//获取file图片名称
            String filePath= ResourceUtils.getURL("sj_web\\src\\main\\resources\\static\\img\\upload-img").getPath();
            upload.upload(file, filePath, fileName);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        return 1;
    }

    /**
     * 根据id删除公告
     * @return
     */
    @RequestMapping("deleteNoticeById.json")
    @ResponseBody
    public Object deleteNoticeById(@RequestParam("noticeid") Long niticeId){
      return noticeService.deleteNoticeById(niticeId);
    }

    /**
     * 添加小区公告关联
     * @return
     */
    @RequestMapping("addCommunityNotice.json")
    @ResponseBody
    public  Object addCommunityNotice(@RequestParam("noticeId")Long noticeId,
                                      @RequestParam("communityIds[]") Long [] communityIds){
        return  noticeService.addNotice_Community(noticeId,communityIds);

    }



}
