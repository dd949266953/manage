package com.m78.serviceImpl.service;

import com.m78.mapper.NoticeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NoticeServiceImplTest {

    @Autowired
    private NoticeMapper noticeMapper;
    @Test
    public void findAllNotice() {
        System.out.println(noticeMapper.findAllNotice());
    }
}