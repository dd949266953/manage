package com.m78.entity;

import java.util.Date;

public class Tenement {
    private Long id;

    private String name;

    private String phone;

    private Long integrals;

    private Date registrationdate;

    private Long state;

    private Long qqnumber;

    private String wxnumber;

    private String urgencyman;

    private String urgencymanphone;

    private String sex;

    private String nation;

    private String remark;

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

    public Long getIntegrals() {
        return integrals;
    }

    public void setIntegrals(Long integrals) {
        this.integrals = integrals;
    }

    public Date getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(Date registrationdate) {
        this.registrationdate = registrationdate;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Long getQqnumber() {
        return qqnumber;
    }

    public void setQqnumber(Long qqnumber) {
        this.qqnumber = qqnumber;
    }

    public String getWxnumber() {
        return wxnumber;
    }

    public void setWxnumber(String wxnumber) {
        this.wxnumber = wxnumber == null ? null : wxnumber.trim();
    }

    public String getUrgencyman() {
        return urgencyman;
    }

    public void setUrgencyman(String urgencyman) {
        this.urgencyman = urgencyman == null ? null : urgencyman.trim();
    }

    public String getUrgencymanphone() {
        return urgencymanphone;
    }

    public void setUrgencymanphone(String urgencymanphone) {
        this.urgencymanphone = urgencymanphone == null ? null : urgencymanphone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "Tenement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", integrals=" + integrals +
                ", registrationdate=" + registrationdate +
                ", state=" + state +
                ", qqnumber=" + qqnumber +
                ", wxnumber='" + wxnumber + '\'' +
                ", urgencyman='" + urgencyman + '\'' +
                ", urgencymanphone='" + urgencymanphone + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}