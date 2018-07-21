package com.m78.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.Notice;
import com.m78.mapper.NoticeMapper;
import com.m78.service.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 公告实现类
 */
@Service(version = "1.0.0")
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> getAllNotice(String noticeName, int page, int limit) {
        int start=(page-1)*limit;
        return noticeMapper.getAllNotice(noticeName,start,limit);
    }

    @Override
    public Long getAllNoticeCount(String noticeName) {
        return noticeMapper.getAllNoticeCount(noticeName);
    }

    @Override
    public int deleteNoticeById(Long noticeId) {
        return noticeMapper.deleteByPrimaryKey(noticeId);
    }

    @Override
    public int addNotice(Notice notice) {
        return noticeMapper.insertSelective(notice);
    }

    @Override
    public int updateNoticeById(Notice notice) {
        return noticeMapper.updateByPrimaryKeySelective(notice);
    }
}
