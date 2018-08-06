package com.m78.entity;

import java.io.Serializable;
import java.util.Date;

public class Messagerecord implements Serializable {
    private Long id;

    private Long messageid;

    private String sendobject;

    private Date sendtime;

    private Long sendcount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMessageid() {
        return messageid;
    }

    public void setMessageid(Long messageid) {
        this.messageid = messageid;
    }

    public String getSendobject() {
        return sendobject;
    }

    public void setSendobject(String sendobject) {
        this.sendobject = sendobject;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Long getSendcount() {
        return sendcount;
    }

    public void setSendcount(Long sendcount) {
        this.sendcount = sendcount;
    }
}