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
     * @param userName
     * @return
     */
     Set<String> getRoles(@Param("userName")String userName);

    /**
     * 通过用户名查询权限信息
     * @param userName
     * @return
     */
     Set<String> getPermissions(@Param("userName") String userName);

    /**
     * 根据姓名查询所有员工信息
     * @return
     */
     List<User> getAllUserByName(@Param("userName") String userName,@Param("start") int start,
                                 @Param("end") int end);

    /**
     * 获取所有员工数量
     * @return
     */
     Long getAllCount(@Param("userName") String userName);
}