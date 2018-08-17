package com.m78.config;

import com.alibaba.dubbo.config.annotation.Reference;
import com.m78.entity.User;
import com.m78.service.staff.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;



/**
 * 自定realm
 */
public class ShiroRealm extends AuthorizingRealm {


    @Reference
    private UserService userService;

    /**
     * 权限认证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户名
        Long userId=(Long)principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        //角色
        authorizationInfo.setRoles(userService.getRoleByUserName(userId));
        //权限
        authorizationInfo.setStringPermissions(userService.getPermissionByUserName(userId));
        //返回
        return authorizationInfo;
    }

    /**
     * 登录认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       //获取登录的用户名
       String name=authenticationToken.getPrincipal().toString();
       //根据用户名查询
        User user=userService.getUserByName(name);
        if(user!=null){
            SimpleAuthenticationInfo authcInfo=new SimpleAuthenticationInfo(user.getId(),user.getPassword(),"xx");
            return authcInfo;
        }
        return null;
    }
}
