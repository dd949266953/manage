package com.m78.mapper;

import com.m78.entity.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Set;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /**
     * 通过用户名查询用户
     * @param userName
     * @return
     */
     User getByUserName(@Param("userName") String userName);

    /**
     * 通过用户名查询角色信息
     * @param userId
     * @return
     */
     Set<String> getRoles(@Param("userId")Long  userId);

    /**
     * 通过用户名查询权限信息
     * @param userId
     * @return
     */
     Set<String> getPermissions(@Param("userId") Long userId);

    /**
     * 根据姓名查询所有员工信息
     * @return
     */
     List<User> getAllUserByName(@Param("userName") String userName,@Param("start") int start,
                                 @Param("end") int end,@Param("admin")String admin,@Param("id") Long id);

    /**
     * 获取所有员工数量
     * @return
     */
     Long getAllCount(@Param("userName") String userName,@Param("admin")String admin,@Param("id") Long id);

    /**
     * 根据部门查询所有员工信息
     * @return
     */
     List<User> getUserByDepartmentId(@Param("departmentId") Long departmentId,@Param("userId") Long userId);

    /**
     * 根据id更新密码
     * @param password
     * @param userId
     * @return
     */
     int updatePasswordById(@Param("password") String password,@Param("userId") Long userId);

//    /**
//     * 根据id查询用户
//     * @param userId
//     * @return
//     */
       User getUserById(@Param("userId") Long userId);
}