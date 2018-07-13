package com.m78.entity;

import java.util.Date;

public class Notice {
    private Long id;

    private String noticename;

    private Long type;

    private Long establish;

    private Date time;

    private Long level;

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
        this.noticename = noticename == null ? null : noticename.trim();
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getEstablish() {
        return establish;
    }

    public void setEstablish(Long establish) {
        this.establish = establish;
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

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", noticename='" + noticename + '\'' +
                ", type=" + type +
                ", establish=" + establish +
                ", time=" + time +
                ", level=" + level +
                '}';
    }
}