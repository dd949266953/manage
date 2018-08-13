package com.m78.entity;

import java.io.Serializable;

public class Permission implements Serializable {
    private Long id;

    private String permissionname;

    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", permissionname='" + permissionname + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}