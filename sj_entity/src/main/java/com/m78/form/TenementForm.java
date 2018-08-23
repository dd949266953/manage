package com.m78.form;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


import java.io.Serializable;
import java.util.Date;

@Data
public class TenementForm implements Serializable {
    private String address;
    private Long community;
    private Long building;
    private Long unit;
    private Long housenumber;
    private String name;
    private String phone;
    private Date registrationdate;
    private Long relation;
    private Long qqnumber;
    private String wxnumber;
    private String urgencyman;
    private String urgencymanphone;
    private String sex;
    private String nation;
    private String remark;
    private String idcard;
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private Date birthday;
    private Long ownernumber;

}
