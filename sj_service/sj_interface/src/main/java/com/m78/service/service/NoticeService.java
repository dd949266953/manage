package com.m78.service.service;

import com.m78.entity.Notice;

import java.util.List;

/**
 * 公告
 */
public interface NoticeService {
    /**
     * 获取公告列表
     * @param noticeName
     * @param page
     * @param limit
     * @return
     */
    List<Notice> getAllNotice(String noticeName,int page,int limit);

    /**
     * 获取总数
     * @param noticeName
     * @return
     */
    Long getAllNoticeCount(String noticeName);

    /**
     * 删除公告
     * @param noticeId
     * @return
     */
    int deleteNoticeById(Long noticeId);

    /**
     * 添加公告
     * @param
     * @return
     */
    int addNotice(String noticeName,Long type,String content,String img,Long level);

    /**
     * 修改公告
     * @param notice
     * @return
     */
    int updateNoticeById(Notice notice);
}
