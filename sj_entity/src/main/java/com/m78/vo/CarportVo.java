package com.m78.vo;

import java.io.Serializable;

public class CarportVo implements Serializable {
    private Long carportNo;
    private Long communityId;
    private String communityName;
    private Long carportTypeId;
    private String carportType;
    private Long carportStateId;
    private String carportState;
    private double area;
    private Long charNum;
    private String remark;

    public Long getcarportNo() {
        return carportNo;
    }

    public void setcarportNo(Long carportNo) {
        this.carportNo = carportNo;
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

    public Long getCarportTypeId() {
        return carportTypeId;
    }

    public void setCarportTypeId(Long carportTypeId) {
        this.carportTypeId = carportTypeId;
    }

    public String getcarportType() {
        return carportType;
    }

    public void setcarportType(String carportType) {
        this.carportType = carportType;
    }

    public Long getCarportStateId() {
        return carportStateId;
    }

    public void setCarportStateId(Long carportStateId) {
        this.carportStateId = carportStateId;
    }

    public String getCarportState() {
        return carportState;
    }

    public void setCarportState(String carportState) {
        this.carportState = carportState;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Long getCharNum() {
        return charNum;
    }

    public void setCharNum(Long charNum) {
        this.charNum = charNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "CarportVo{" +
                "carportNo=" + carportNo +
                ", communityId=" + communityId +
                ", communityName='" + communityName + '\'' +
                ", carportTypeId=" + carportTypeId +
                ", carportType='" + carportType + '\'' +
                ", carportStateId=" + carportStateId +
                ", carportState='" + carportState + '\'' +
                ", area=" + area +
                ", charNum=" + charNum +
                ", remark='" + remark + '\'' +
                '}';
    }
}
