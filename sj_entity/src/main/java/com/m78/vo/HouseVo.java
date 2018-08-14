package com.m78.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class HouseVo implements Serializable {
    private Long houseId;

    private Long communityId;

    private String communityName;

    private Long buildingId;

    private String buildingName;

    private Long unitNumber;

    private Long houseNo;

    private Long charNum;

    private double area;

    private String houseType;

    private String relation;
}
