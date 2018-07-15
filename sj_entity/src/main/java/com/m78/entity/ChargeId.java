package com.m78.entity;

import java.io.Serializable;

public class ChargeId implements Serializable {
    private Long id;

    private Long chargeitemid;

    private Long billid;

    private Long signid;

    private Long type;

    private String houseName;

    private  String carPortName;

    private  String HousePhone;

    private  String carPortPhone;

    private  double moneys;

    private  String communityName;
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

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getCarPortName() {
        return carPortName;
    }

    public void setCarPortName(String carPortName) {
        this.carPortName = carPortName;
    }

    public String getHousePhone() {
        return HousePhone;
    }

    public void setHousePhone(String housePhone) {
        HousePhone = housePhone;
    }

    public String getCarPortPhone() {
        return carPortPhone;
    }

    public void setCarPortPhone(String carPortPhone) {
        this.carPortPhone = carPortPhone;
    }

    public double getMoneys() {
        return moneys;
    }

    public void setMoneys(double moneys) {
        this.moneys = moneys;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    @Override
    public String toString() {
        return "ChargeId{" +
                "id=" + id +
                ", chargeitemid=" + chargeitemid +
                ", billid=" + billid +
                ", signid=" + signid +
                ", type=" + type +
                ", houseName='" + houseName + '\'' +
                ", carPortName='" + carPortName + '\'' +
                ", HousePhone='" + HousePhone + '\'' +
                ", carPortPhone='" + carPortPhone + '\'' +
                ", moneys=" + moneys +
                ", communityName='" + communityName + '\'' +
                '}';
    }
}