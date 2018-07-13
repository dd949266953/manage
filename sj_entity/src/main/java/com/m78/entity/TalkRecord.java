package com.m78.entity;

import java.util.Date;

public class TalkRecord {
    private Long id;

    private Long talkId;

    private Long userId;

    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTalkId() {
        return talkId;
    }

    public void setTalkId(Long talkId) {
        this.talkId = talkId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TalkRecord{" +
                "id=" + id +
                ", talkId=" + talkId +
                ", userId=" + userId +
                ", time=" + time +
                '}';
    }
}