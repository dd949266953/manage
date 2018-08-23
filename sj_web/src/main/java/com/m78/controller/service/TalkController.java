package com.m78.controller.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.service.TalkService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
     * 跳转到处理工单页面
     * @return
     */
    @RequestMapping("doSetTalk/{id}")
    public  ModelAndView doSetTalk(@PathVariable("id") Long id){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("service/talk/setTalk");
        modelAndView.addObject("talkId",id);
        return modelAndView;
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

    /**
     * 更新工单状态
     * @param stateId  状态id
     * @param talkId 工单id
     * @return
     */
    @RequestMapping("updateTalkState")
    @ResponseBody
    public  Object updateTalkState(@RequestParam("stateId")Long stateId,@RequestParam("talkId") Long talkId){
        return  talkService.updateTalkState(stateId,talkId);
    }

}
