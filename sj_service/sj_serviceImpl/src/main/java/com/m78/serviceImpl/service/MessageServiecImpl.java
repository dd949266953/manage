package com.m78.serviceImpl.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Message;
import com.m78.mapper.MessageMapper;
import com.m78.mapper.TenementMapper;
import com.m78.service.service.MessageService;
import com.m78.util.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 短信
 */
@Service
public class MessageServiecImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private TenementMapper tenementMapper;


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

    @Override
    public List<String> sendCommunityMessage(Long community) {
        List<String> phones=new ArrayList<String>();
        phones=tenementMapper.getPhoneByCommunityId(community);
        return  phones;

    }
}
