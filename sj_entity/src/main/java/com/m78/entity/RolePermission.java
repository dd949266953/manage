package com.m78.entity;

import java.io.Serializable;

public class RolePermission implements Serializable {
    private Long id;

    private Long roleid;

    private Long permissionid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Long permissionid) {
        this.permissionid = permissionid;
    }

    @Override
    public String toString() {
        return "RolePermission{" +
                "id=" + id +
                ", roleid=" + roleid +
                ", permissionid=" + permissionid +
                '}';
    }
}