package com.m78.serviceImpl.staff;

import com.alibaba.dubbo.config.annotation.Service;
import com.m78.entity.UserPermission;
import com.m78.mapper.UserPermissionMapper;
import com.m78.service.staff.SetPermissionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * 添加权限实现类
 */
@Service
public class SetPermissionServiceImpl implements SetPermissionService {

    @Autowired
    private UserPermissionMapper userPermissionMapper;

    @Override
    public int addPermission(UserPermission userPermission) {
        return userPermissionMapper.insertSelective(userPermission);
    }

    @Override
    public int deletePermission(Long userId,Long permissionId) {
        return userPermissionMapper.deletePermissionByUserId(userId,permissionId);
    }

    @Override
    public Set<Long> getPermissionByUserId(Long userId) {
        return userPermissionMapper.getPermissionId(userId);
    }
}
