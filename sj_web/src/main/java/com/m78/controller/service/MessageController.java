package com.m78.controller.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.Message;
import com.m78.service.service.MessageService;
import com.m78.util.DataTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 短信管理
 */
@Controller
@RequestMapping("message")
public class MessageController {

    @Reference
    private MessageService messageService;


    /**
     * 跳转短信主页面
     * @return
     */
    @RequestMapping("doMessage")
    public  String  doMessage(){
      return  "service/message/messageList";
    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("doAddMessage")
    public  String doAddMessage(){
       return "service/message/addMessage";
    }

    /**
     * 跳转到发送小区页面
     * @return
     */
    @RequestMapping("doSendCommunity")
    public  String doSendCommutity(){
       return "service/message/sendCommunity";
    }
    /**
     * 跳转到发送用户页面
     * @return
     */
    @RequestMapping("doSendTenement")
    public  String doSendTenement(){
        return "service/message/sendTenement";
    }

    /**
     *
     * 获取所有短信模板
     * @return
     */
    @RequestMapping("getAllMessage.json")
    @ResponseBody
    public  Object getAllMessage(@RequestParam("name") String name,@RequestParam("page") int page,
                                 @RequestParam("limit") int limit){
        return DataTable.bindTableUtil(0,messageService.getMessageCount(name),
                messageService.getAllMessage(name, page,limit));

    }

    /**
     * 添加短信
     * @return
     */
    @RequestMapping("addMessage.json")
    @ResponseBody
    public Object addMessage(Message message){
     return  messageService.addMessage(message);
    }

    /**
     * 根据id删除短信
     * @return
     */
    @RequestMapping("deleteMessageById.json")
    @ResponseBody
    public  Object deleteMessageById(@RequestParam("messageId") Long id){
         return  messageService.deleteMessage(id);
    }


}
