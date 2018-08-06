package com.m78.serviceImpl.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Message;
import com.m78.mapper.MessageMapper;
import com.m78.service.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 短信
 */
@Service
public class MessageServiecImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;


    @Override
    public List<Message> getAllMessage(String name, int page, int limit) {
        int start=(page-1)*limit;
        return messageMapper.getAllMessageList(name,start,limit);
    }

    @Override
    public Long getMessageCount(String name) {
        return messageMapper.getMessageCount(name);
    }

    @Override
    public int deleteMessage(Long messageId) {
        return messageMapper.deleteByPrimaryKey(messageId);
    }

    @Override
    public int addMessage(Message message) {
        return messageMapper.insert(message);
    }
}
