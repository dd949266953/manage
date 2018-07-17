package com.m78.entity;

import java.io.Serializable;
import java.util.Date;

public class Tenement implements Serializable {
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

    private Long communityid;

    private HouseTentment houseTentment;

    private House house;

    private HouseBuliding houseBuliding;

    private Building building;

    private Community community;

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
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        this.wxnumber = wxnumber;
    }

    public String getUrgencyman() {
        return urgencyman;
    }

    public void setUrgencyman(String urgencyman) {
        this.urgencyman = urgencyman;
    }

    public String getUrgencymanphone() {
        return urgencymanphone;
    }

    public void setUrgencymanphone(String urgencymanphone) {
        this.urgencymanphone = urgencymanphone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Long communityid) {
        this.communityid = communityid;
    }

    public HouseTentment getHouseTentment() {
        return houseTentment;
    }

    public void setHouseTentment(HouseTentment houseTentment) {
        this.houseTentment = houseTentment;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public HouseBuliding getHouseBuliding() {
        return houseBuliding;
    }

    public void setHouseBuliding(HouseBuliding houseBuliding) {
        this.houseBuliding = houseBuliding;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
}