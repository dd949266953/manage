package com.m78.serviceImpl.staff;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.User;
import com.m78.mapper.UserMapper;
import com.m78.service.staff.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

/**
 * 员工实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String userName) {
        return userMapper.getByUserName(userName);
    }

    @Override
    public Set<String> getRoleByUserName(Long userId) {
        return userMapper.getRoles(userId);
    }

    @Override
    public Set<String> getPermissionByUserName(Long userId) {
        return userMapper.getPermissions(userId);
    }

    @Override
    public List<User> getAllUserByName(int page, int limit, String userName,String admin,Long id) {
        int start=(page-1)*limit;
        return userMapper.getAllUserByName(userName,start,limit,admin,id);
    }

    @Override
    public Long getAllCount(String userName,String admin,Long id) {
        return userMapper.getAllCount(userName,admin,id);
    }

    @Override
    public int deleteUser(Long userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public List<User> getUserByDepartmentId(Long departmentId, Long userId) {
        return userMapper.getUserByDepartmentId(departmentId,userId);
    }

    @Override
    public int updatePasswordById(String password, Long userId) {
        return userMapper.updatePasswordById(password,userId);
    }
}
