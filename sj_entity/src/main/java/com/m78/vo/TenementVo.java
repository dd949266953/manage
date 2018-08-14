package com.m78.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TenementVo implements Serializable {
    private Long tenementId;
    private Long communityId;
    private String communityName;
    private Long buildingId;
    private String buildingName;
    private Long houseId;
    private Long unitNumber;
    private Long fool;
    private String houseType;
    private String tenementName;
    private String phone;
    private String relation;
    private String carNo;
    private String carNumber;
    private String carportNo;
    private String carportType;
    private Date returnTime;

}
