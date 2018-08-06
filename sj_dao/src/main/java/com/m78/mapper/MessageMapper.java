package com.m78.mapper;

import com.m78.entity.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
    //获取信息
    List<Message> getAllMessageList(@Param("name") String name,@Param("start") int start,@Param("end") int end);
    //获取总数
    Long getMessageCount(@Param("name") String name);
}