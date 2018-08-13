package com.m78.service.service;

import com.m78.entity.Message;

import java.util.List;

/**
 * 短信通知
 */
public interface MessageService {
    /**
     * 获取所有短信信息
     * @param name
     * @param page
     * @param limit
     * @return
     */
    List<Message> getAllMessage(String name,int page,int limit);

    /**
     * 获取总数
     * @param name
     * @return
     */
    Long getMessageCount(String name);

    /**
     * 删除短信模板
     * @param messageId
     * @return
     */
    int deleteMessage(Long messageId);

    /**
     * 添加短信模板
     * @return
     */
    int addMessage(Message message);


}
