package com.m78.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Tenement implements Serializable {
    private Long id;

    private String name;

    private String nickname;

    private String phone;

    private Long integrals;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date registrationdate;

    private Long state;

    private Long qqnumber;

    private String wxnumber;

    private String urgencyman;

    private String urgencymanphone;

    private String sex;

    private String nation;

    private String remark;

    private Long communityid;

    private String idcard;

    private Date birthday;

    private Long ownernumber;

    private Community community;

    private DictionaryItem dictionaryItem;

    private String photo;

    private String openid;

}