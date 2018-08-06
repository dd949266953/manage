package com.m78.controller.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.service.TalkService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 工单管理
 */
@Controller
@RequestMapping("talk")
public class TalkController {

    @Reference(version = "1.0.0")
    private TalkService talkService;

    /**
     * 跳转到工单列表页面
     * @return
     */
    @RequestMapping("doTalkList")
    public  String doTalkList(){
        return  "service/talk/talkList";
    }

    /**
     * 获取工单信息
     * @return
     */
    @RequestMapping("getAllTalk.json")
    @ResponseBody
    public  Object getAllTalk(@RequestParam("name") String name,@RequestParam("page") int page,
                              @RequestParam("limit") int limit){
          return DataTable.bindTableUtil(0,talkService.getTalkCount(name),talkService.getAllTalk(name,page,limit));
    }

    /**
     *
     * 根据id删除工单
     * @return
     */
    @RequestMapping("deleteTalkById.json")
    @ResponseBody
    public  Object deleteTalkById(@RequestParam("id") Long talkId){
        return  talkService.deleteTalkById(talkId);

    }

}
