package com.m78.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getTentmentid() {
        return tentmentid;
    }

    public void setTentmentid(Long tentmentid) {
        this.tentmentid = tentmentid;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures == null ? null : pictures.trim();
    }

    public Tenement getTenement() {
        return tenement;
    }

    public void setTenement(Tenement tenement) {
        this.tenement = tenement;
    }


    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Talk{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", tentmentid=" + tentmentid +
                ", tenement=" + tenement +
                ", state=" + state +
                ", stateName='" + stateName + '\'' +
                ", time=" + time +
                ", type=" + type +
                ", typeName='" + typeName + '\'' +
                ", pictures='" + pictures + '\'' +
                '}';
    }
}