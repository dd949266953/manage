package com.m78.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class Notice implements Serializable {
    private Long id;

    private String noticename;

    private Long type;

    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    private Date time;

    private Long level;

    private String content;

    private String image;

    private Integer contenttype;

    private Long parentnotice;
    //公告名称
    private  String typename;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoticename() {
        return noticename;
    }

    public void setNoticename(String noticename) {
        this.noticename = noticename;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getContenttype() {
        return contenttype;
    }

    public void setContenttype(Integer contenttype) {
        this.contenttype = contenttype;
    }

    public Long getParentnotice() {
        return parentnotice;
    }

    public void setParentnotice(Long parentnotice) {
        this.parentnotice = parentnotice;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", noticename='" + noticename + '\'' +
                ", type=" + type +
                ", time=" + time +
                ", level=" + level +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                ", contenttype=" + contenttype +
                ", parentnotice=" + parentnotice +
                ", typename='" + typename + '\'' +
                '}';
    }
}