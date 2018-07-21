package com.m78.mapper;

import com.m78.entity.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoticeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
    //获取公告
    List<Notice> getAllNotice(@Param("noticeName") String noticeName,@Param("start") int start,
                              @Param("end") int end);
    //获取总条数
    Long getAllNoticeCount(@Param("noticeName") String noticeName);
}