package com.m78.entity;

import java.io.Serializable;

public class Staff implements Serializable {
    private Long id;

    private String name;

    private String phone;

    private String wxnumber;

    private String nametwo;

    private Long position;

    private String remark;

    private Long departmentid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getWxnumber() {
        return wxnumber;
    }

    public void setWxnumber(String wxnumber) {
        this.wxnumber = wxnumber == null ? null : wxnumber.trim();
    }

    public String getNametwo() {
        return nametwo;
    }

    public void setNametwo(String nametwo) {
        this.nametwo = nametwo == null ? null : nametwo.trim();
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", wxnumber='" + wxnumber + '\'' +
                ", nametwo='" + nametwo + '\'' +
                ", position=" + position +
                ", remark='" + remark + '\'' +
                ", departmentid=" + departmentid +
                '}';
    }
}