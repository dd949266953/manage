package com.m78.service.staff;

import com.m78.entity.UserPermission;

import java.util.Set;

/**
 * 权限接口
 */
public interface SetPermissionService {

    /**
     * 添加权限关系
     * @param userPermission
     * @return
     */
    int addPermission(UserPermission userPermission);

    /**
     * 删除权限关系
     * @return
     */
    int deletePermission(Long userId,Long permissionId);

    /**
     * 根据用户id查询拥有的权限
     * @param userId
     * @return
     */
    Set<Long> getPermissionByUserId(Long userId);
}
