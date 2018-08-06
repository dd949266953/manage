package com.m78.controller.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.service.service.TalkService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
