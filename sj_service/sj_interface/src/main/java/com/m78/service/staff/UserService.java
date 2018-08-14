package com.m78.service.staff;

import com.m78.entity.User;

import java.util.List;
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

    /**
     * 根据名称查询员工
     * @param page
     * @param limit
     * @param userName
     * @return
     */
    List<User> getAllUserByName(int page,int limit,String userName);

    /**
     * 查询员工总数
     * @param userName
     * @return
     */
    Long getAllCount(String userName);

    /**
     * 删除员工信息
     * @return
     */
    int deleteUser(Long userId);
}
