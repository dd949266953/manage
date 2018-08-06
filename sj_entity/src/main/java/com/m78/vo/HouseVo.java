package com.m78.vo;

import java.io.Serializable;

public class HouseVo implements Serializable {
    private Long houseId;

    private String communityName;

    private Long buildingId;

    private String buildingName;

    private Long unitNumber;

    private Long houseNo;

    private Long charNum;

    private double area;

    private String houseType;

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
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

    public Long getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(Long unitNumber) {
        this.unitNumber = unitNumber;
    }

    public Long getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(Long houseNo) {
        this.houseNo = houseNo;
    }

    public Long getCharNum() {
        return charNum;
    }

    public void setCharNum(Long charNum) {
        this.charNum = charNum;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    @Override
    public String toString() {
        return "HouseVo{" +
                "houseId=" + houseId +
                ", communityName='" + communityName + '\'' +
                ", buildingId=" + buildingId +
                ", buildingName='" + buildingName + '\'' +
                ", unitNumber=" + unitNumber +
                ", houseNo=" + houseNo +
                ", charNum=" + charNum +
                ", area=" + area +
                ", houseType='" + houseType + '\'' +
                '}';
    }
}
