package com.m78.mapper;

import com.m78.entity.Talk;
import com.m78.vo.TalkVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TalkMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Talk record);

    int insertSelective(Talk record);

    Talk selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Talk record);

    int updateByPrimaryKey(Talk record);
    //获取所有工单信息
    List<Talk> getAllTalk(@Param("name") String name,@Param("start") int start,@Param("end") int end);
    //获取工单总数
    Long getAllTalkCount(@Param("name") String name);

<<<<<<< HEAD
    List<TalkVo> findAllTalk(@Param("tenementId")Long tenementId);

=======
    int updateTalkState(@Param("stateId")Long stateId ,@Param("talkId") Long talkId);
>>>>>>> 2de4c8a367422cc585aaab51948e47e70c67a479
}