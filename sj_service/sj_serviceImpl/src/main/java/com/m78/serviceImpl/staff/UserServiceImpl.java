package com.m78.serviceImpl.staff;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.User;
import com.m78.mapper.UserMapper;
import com.m78.service.staff.UserService;
import org.springframework.beans.factory.annotation.Autowired;

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
    public Set<String> getRoleByUserName(String userName) {
        return userMapper.getRoles(userName);
    }

    @Override
    public Set<String> getPermissionByUserName(String userName) {
        return userMapper.getPermissions(userName);
    }
}