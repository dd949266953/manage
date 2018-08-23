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

    private  String address;

    private String photo;

    private String openid;
    public Tenement(){

    }

    public Tenement(String name, String phone, Long state, Long qqnumber, String wxnumber, String urgencyman, String urgencymanphone, String sex, String nation, String remark, Long communityid, String idcard, Date birthday, Long ownernumber) {
        this.name = name;
        this.phone = phone;
        this.state = state;
        this.qqnumber = qqnumber;
        this.wxnumber = wxnumber;
        this.urgencyman = urgencyman;
        this.urgencymanphone = urgencymanphone;
        this.sex = sex;
        this.nation = nation;
        this.remark = remark;
        this.communityid = communityid;
        this.idcard = idcard;
        this.birthday = birthday;
        this.ownernumber = ownernumber;
    }
}