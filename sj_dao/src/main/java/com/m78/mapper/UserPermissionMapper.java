package com.m78.mapper;

import com.m78.entity.UserPermission;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

public interface UserPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserPermission record);

    int insertSelective(UserPermission record);

    UserPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserPermission record);

    int updateByPrimaryKey(UserPermission record);

    /**
     * 根据用户id和权限id删除
     * @return
     */
    int deletePermissionByUserId(@Param("userId") Long userId,@Param("permissionId") Long permissionId);

    /**
     * 根据用户id查询所拥有的权限
     * @param userId
     * @return
     */
    Set<Long> getPermissionId(@Param("userId") Long userId);
}