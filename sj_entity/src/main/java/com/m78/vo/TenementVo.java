package com.m78.vo;

import java.io.Serializable;

public class TenementVo implements Serializable {
    private Long tenementId;
    private Long communityId;
    private String communityName;
    private Long buildingId;
    private String buildingName;
    private Long houseId;
    private Long unitNumber;
    private Long fool;
    private String tenementName;
    private String phone;
    private String relation;

    public Long getTenementId() {
        return tenementId;
    }

    public void setTenementId(Long tenementId) {
        this.tenementId = tenementId;
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

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public Long getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(Long unitNumber) {
        this.unitNumber = unitNumber;
    }

    public Long getFool() {
        return fool;
    }

    public void setFool(Long fool) {
        this.fool = fool;
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

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return "TenementVo{" +
                "tenementId=" + tenementId +
                ", communityId=" + communityId +
                ", communityName='" + communityName + '\'' +
                ", buildingId=" + buildingId +
                ", buildingName='" + buildingName + '\'' +
                ", houseId=" + houseId +
                ", unitNumber=" + unitNumber +
                ", fool=" + fool +
                ", tenementName='" + tenementName + '\'' +
                ", phone='" + phone + '\'' +
                ", relation='" + relation + '\'' +
                '}';
    }
}
