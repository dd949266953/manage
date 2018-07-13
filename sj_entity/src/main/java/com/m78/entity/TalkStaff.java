package com.m78.entity;

public class TalkStaff {
    private Long id;

    private Long ftaffId;

    private Long talkId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFtaffId() {
        return ftaffId;
    }

    public void setFtaffId(Long ftaffId) {
        this.ftaffId = ftaffId;
    }

    public Long getTalkId() {
        return talkId;
    }

    public void setTalkId(Long talkId) {
        this.talkId = talkId;
    }

    @Override
    public String toString() {
        return "TalkStaff{" +
                "id=" + id +
                ", ftaffId=" + ftaffId +
                ", talkId=" + talkId +
                '}';
    }
}