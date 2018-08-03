package com.m78.serviceImpl.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Noticetype;
import com.m78.mapper.NoticetypeMapper;
import com.m78.service.service.NoticeTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 公告类型
 */
@Service(version = "1.0.0")
public class NoticeTypeServiceImpl implements NoticeTypeService {

    @Autowired
    private NoticetypeMapper noticetypeMapper;

    @Override
    public List<Noticetype> getAllNoticeTypeByPage(String typeName, int page, int limit) {
        int start=(page-1)*limit;
        return noticetypeMapper.getAllNoticeTypeByPage(typeName,start,limit);
    }

    @Override
    public Long getAllNoticeTypeCount(String typeName) {
        return noticetypeMapper.getAllNoticeTypeCount(typeName);
    }

    @Override
    public List<Noticetype> getAllNoticeType() {
        return noticetypeMapper.getAllNoticeType();
    }

    @Override
    public int addNoticeType(String typeName) {
        return noticetypeMapper.insert(typeName);
    }

    @Override
    public int deleteNoticeType(Long noticeTypeId) {
        return noticetypeMapper.deleteByPrimaryKey(noticeTypeId);
    }
}
