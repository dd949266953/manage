package com.m78.service.service;

import com.m78.entity.Talk;

import java.util.List;

/**
 *
 * 工单接口
 */
public interface TalkService {
    /**
     * 获取所有工单信息
     * @param name
     * @param page
     * @param limit
     * @return
     */
    List<Talk> getAllTalk(String name,int page,int limit);

    /**
     * 获取工单信息总数
     * @return
     */
    Long getTalkCount(String name);

    /**
     * 删除工单
     * @param talkId
     * @return
     */
    int deleteTalkById(Long talkId);

    /**
     * 更新工单状态
     * @param stateId  状态id
     * @param talkId   工单id
     * @return
     */
    int updateTalkState(Long stateId,Long talkId);
}
