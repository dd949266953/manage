package com.m78.serviceImpl.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Talk;
import com.m78.mapper.TalkMapper;
import com.m78.service.service.TalkService;
import com.m78.vo.TalkVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 工单实现类
 */
@Service(version = "1.0.0")
public class TalkServiceImpl implements TalkService {

    @Autowired
    private TalkMapper mapper;

    @Override
    public List<Talk> getAllTalk(String name, int page, int limit) {
        int start=(page-1)*limit;
        return mapper.getAllTalk(name,start,limit);
    }

    @Override
    public Long getTalkCount(String name) {
        return mapper.getAllTalkCount(name);
    }

    @Override
    public int deleteTalkById(Long talkId) {
        return mapper.deleteByPrimaryKey(talkId);
    }

    @Override
<<<<<<< HEAD
    public List<TalkVo> findAllTalk(Long tenementId) {
        return mapper.findAllTalk(tenementId);
    }

    @Override
    public int insert(Talk record) {
        return mapper.insert(record);
=======
    public int updateTalkState(Long stateId, Long talkId) {
        return mapper.updateTalkState(stateId,talkId);
>>>>>>> 2de4c8a367422cc585aaab51948e47e70c67a479
    }
}
