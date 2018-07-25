package com.m78.service.service;

import com.m78.entity.Noticetype;

import java.util.List;

/**
 * 公告类型
 */
public interface NoticeTypeService {
    /**
     * 获取所有公告类型带分页条件
     * @param typeName
     * @param page
     * @param limit
     * @return
     */
    List<Noticetype> getAllNoticeTypeByPage(String typeName,int page,int limit);

    /**
     * 获取总条数
     * @param typeName
     * @return
     */
    Long getAllNoticeTypeCount(String typeName);

    /**
     *获取所有公告类型
     * @return
     */
    List<Noticetype> getAllNoticeType();

    /**
     * 添加公告
     * @param typeName
     * @return
     */
    int addNoticeType(String typeName);
}
