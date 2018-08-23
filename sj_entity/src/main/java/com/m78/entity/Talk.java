package com.m78.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Talk implements Serializable {
    private Long id;

    private String title;

    private Long tentmentid;

    private  Tenement tenement;

    private Long state;
    private  String stateName;
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date time;

    private Long type;
    private  String typeName;

    private String pictures;

}