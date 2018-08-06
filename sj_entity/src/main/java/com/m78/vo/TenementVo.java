package com.m78.vo;

import java.io.Serializable;

public class TenementVo implements Serializable {
    //  tenementId,houseId ,tenementName , communityName , buildingName,state,phone
    private Integer tenementId;
    private Integer houseId;
    private String tenementName;
    private String communityName;
    private String buildingName;
    private Long state;
    private String phone;
    private Long unitNumber;


    public Integer getTenementId() {
        return tenementId;
    }

    public void setTenementId(Integer tenementId) {
        this.tenementId = tenementId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getTenementName() {
        return tenementName;
    }

    public void setTenementName(String tenementName) {
        this.tenementName = tenementName;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(Long unitNumber) {
        this.unitNumber = unitNumber;
    }
}
