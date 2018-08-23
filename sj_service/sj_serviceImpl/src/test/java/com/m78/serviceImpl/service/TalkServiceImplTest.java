package com.m78.serviceImpl.service;

import com.m78.entity.Talk;
import com.m78.mapper.TalkMapper;
import com.m78.vo.TalkVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TalkServiceImplTest {

    @Autowired
    private TalkMapper talkMapper;
    @Test
    public void findAllTalk(Long tenementId) {

        List<TalkVo> list=talkMapper.findAllTalk(tenementId);
        for (TalkVo talk : list) {
            System.out.println(talk.toString());
        }

    }
}