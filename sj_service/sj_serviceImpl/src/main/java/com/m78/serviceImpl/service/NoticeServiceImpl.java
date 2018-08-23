package com.m78.serviceImpl.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.CommunityNotice;
import com.m78.entity.Notice;
import com.m78.mapper.CommunityNoticeMapper;
import com.m78.mapper.NoticeMapper;
import com.m78.service.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 公告实现类
 */
@Service(version = "1.0.0")
public class
NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;
    @Autowired
    private CommunityNoticeMapper communityNoticeMapper;

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
    public int addNotice(String noticeName,Long type,String content,String img,Long level) {
        Notice notice=new Notice();
        notice.setNoticename(noticeName);
        notice.setType(type);

        if(content.isEmpty()){
            notice.setImage(img);
            notice.setContenttype(2);
        }else {
            notice.setContent(content);
            notice.setContenttype(1);
        }
        notice.setLevel(level);
        return noticeMapper.insert(notice);
    }

    @Override
    public int updateNoticeById(Notice notice) {
        return noticeMapper.updateByPrimaryKeySelective(notice);
    }

    @Override
    public int addNotice_Community(Long noticeId, Long[] communityId) {
        int num=0;
        CommunityNotice communityNotice=new CommunityNotice();
        communityNotice.setNoticeid(noticeId);
        for (int i =0;i<communityId.length;i++){
            communityNotice.setCommunityid(communityId[i]);
            num=communityNoticeMapper.insertSelective(communityNotice);
        }
        return num;
    }

    @Override
    public List<Notice> findAllNotice() {
        return noticeMapper.findAllNotice();
    }
}
