package com.m78.mapper;

import com.m78.entity.Noticetype;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoticetypeMapper {
    int deleteByPrimaryKey(Long id);
    //添加
    int insert(@Param("typename") String typeName );

    int insertSelective(Noticetype record);

    Noticetype selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Noticetype record);

    int updateByPrimaryKey(Noticetype record);
    //获取所有公告类型
    List<Noticetype> getAllNoticeTypeByPage(@Param("noticeTypeName") String typeName,@Param("start") int
                                      start,@Param("end") int end);
    //获取总条数
    Long getAllNoticeTypeCount(@Param("noticeTypeName")String typeName);

    //获取所有不分页无条件
    List<Noticetype> getAllNoticeType();
}