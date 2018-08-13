package com.m78.service.staff;

import com.m78.entity.User;

import java.util.Set;

/**
 * 员工管理
 */
public interface UserService {
    /**
     * 根据用户名查用户对象
     * @return
     */
    User getUserByName(String userName);

    /**
     * 根据用户名查角色
     * @param userName
     * @return
     */
    Set<String> getRoleByUserName(String userName);

    /**
     * 根据用户名查权限
     * @param userName
     * @return
     */
    Set<String> getPermissionByUserName(String userName);
}
