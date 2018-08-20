package com.m78.entity;

import java.io.Serializable;

public class UserPermission implements Serializable {
    private Long id;

    private Long userid;

    private Long permissionid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Long permissionid) {
        this.permissionid = permissionid;
    }

    @Override
    public String toString() {
        return "UserPermission{" +
                "id=" + id +
                ", userid=" + userid +
                ", permissionid=" + permissionid +
                '}';
    }
}