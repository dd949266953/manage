package com.m78.vo;

import java.io.Serializable;

public class carVo implements Serializable {
    private Long carId;
    private Long communityId;
    private String communityName;
    private Long carportNo;
    private String carNumber;
    private Long tenementId;
    private String tenementName;
    private String phone;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public Long getCarportNo() {
        return carportNo;
    }

    public void setCarportNo(Long carportNo) {
        this.carportNo = carportNo;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Long getTenementId() {
        return tenementId;
    }

    public void setTenementId(Long tenementId) {
        this.tenementId = tenementId;
    }

    public String getTenementName() {
        return tenementName;
    }

    public void setTenementName(String tenementName) {
        this.tenementName = tenementName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "carVo{" +
                "carId=" + carId +
                ", communityId=" + communityId +
                ", communityName='" + communityName + '\'' +
                ", carportNo=" + carportNo +
                ", carNumber='" + carNumber + '\'' +
                ", tenementId=" + tenementId +
                ", tenementName='" + tenementName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
