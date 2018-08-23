package com.m78.service.service;

import com.m78.entity.Talk;
import com.m78.vo.TalkVo;

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

<<<<<<< HEAD
    List<TalkVo> findAllTalk(Long tenementId);

    int insert(Talk record);
=======
    /**
     * 更新工单状态
     * @param stateId  状态id
     * @param talkId   工单id
     * @return
     */
    int updateTalkState(Long stateId,Long talkId);
>>>>>>> 2de4c8a367422cc585aaab51948e47e70c67a479
}
