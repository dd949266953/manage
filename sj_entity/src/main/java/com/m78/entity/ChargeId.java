package com.m78.entity;

import java.io.Serializable;

public class ChargeId implements Serializable {
    private Long id;

    private Long chargeitemid;

    private Long billid;

    private Long signid;

    private Long type;

    private Long tentmentId;

    private  String name;

    private  String phone;

    private  String communityName;

    private  double moneys;

    private Long informk;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChargeitemid() {
        return chargeitemid;
    }

    public void setChargeitemid(Long chargeitemid) {
        this.chargeitemid = chargeitemid;
    }

    public Long getBillid() {
        return billid;
    }

    public void setBillid(Long billid) {
        this.billid = billid;
    }

    public Long getSignid() {
        return signid;
    }

    public void setSignid(Long signid) {
        this.signid = signid;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getTentmentId() {
        return tentmentId;
    }

    public void setTentmentId(Long tentmentId) {
        this.tentmentId = tentmentId;
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

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public double getMoneys() {
        return moneys;
    }

    public void setMoneys(double moneys) {
        this.moneys = moneys;
    }

    public Long getInformk() {
        return informk;
    }

    public void setInformk(Long informk) {
        this.informk = informk;
    }

    @Override
    public String toString() {
        return "ChargeId{" +
                "id=" + id +
                ", chargeitemid=" + chargeitemid +
                ", billid=" + billid +
                ", signid=" + signid +
                ", type=" + type +
                ", tentmentId=" + tentmentId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", communityName='" + communityName + '\'' +
                ", moneys=" + moneys +
                ", informk=" + informk +
                '}';
    }
}