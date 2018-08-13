package com.m78.entity;

import java.io.Serializable;

public class UserRole implements Serializable {
    private Long id;

    private Long staffid;

    private Long roleid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStaffid() {
        return staffid;
    }

    public void setStaffid(Long staffid) {
        this.staffid = staffid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", staffid=" + staffid +
                ", roleid=" + roleid +
                '}';
    }
}