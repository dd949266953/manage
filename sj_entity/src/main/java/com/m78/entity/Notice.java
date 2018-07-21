package com.m78.entity;

import java.util.Date;

public class Notice {
    private Long id;

    private String noticename;

    private Long type;

    private Date time;

    private Long level;

    private String content;

    private String image;

    private Integer contenttype;

    private Long parentnotice;

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
}