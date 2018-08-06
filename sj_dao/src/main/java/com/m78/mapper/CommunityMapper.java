package com.m78.mapper;

import com.m78.entity.Community;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommunityMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Community record);

    int insertSelective(Community record);

    Community selectByPrimaryKey(Long id);

    /**
     * 根据小区id修改小区
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);

    /**
     * 查询小区数量根据名字
     */
    long getCommunityCountByName(@Param("communityName")String communityName);

    /**
     * 查询全部小区
     * @return
     */
    List<Community> findAll(@Param("start") int start,@Param("limit") int limit,@Param("communityName")String communityName);

     /**
     * 查询小区id和名称
     */
    List<Community> getCommunityIdAndName();

    /**
     * 根据小区名称查询小区id
     */
    Long getCommunityIdByName(@Param("communityName")String communityName);

    /**
     * 查询id,name,住址根据name 带分页
     */
    List<Community> getIdNameAddressByName(@Param("start") int start,@Param("limit") int limit,@Param("communityName")String communityName);
}