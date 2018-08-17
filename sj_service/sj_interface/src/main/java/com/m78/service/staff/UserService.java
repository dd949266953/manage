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
     * @param userId
     * @return
     */
    Set<String> getRoleByUserName(Long userId);

    /**
     * 根据用户名查权限
     * @param userId
     * @return
     */
    Set<String> getPermissionByUserName(Long userId);

    /**
     * 根据名称查询员工
     * @param page
     * @param limit
     * @param userName
     * @return
     */
    List<User> getAllUserByName(int page,int limit,String userName,String admin,Long id);

    /**
     * 查询员工总数
     * @param userName
     * @return
     */
    Long getAllCount(String userName,String admin,Long id);

    /**
     * 删除员工信息
     * @return
     */
    int deleteUser(Long userId);

    /**
     * 添加员工
     * @return
     */
    int addUser(User user);

    /**
     * 根据部门查询所有员工信息
     * @return
     */
    List<User> getUserByDepartmentId(Long departmentId,Long userId);

    /**
     * 根据id更新密码
     * @param password
     * @param userId
     * @return
     */
    int updatePasswordById( String password,Long userId);
}
