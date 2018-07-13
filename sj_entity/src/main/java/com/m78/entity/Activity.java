package com.m78.entity;

import java.util.Date;

public class Activity {
    private Long id;

    private String name;

    private Date time;

    private Long lever;

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", lever=" + lever +
                ", state=" + state +
                ", cover='" + cover + '\'' +
                ", activitystarttime=" + activitystarttime +
                ", activityovertime=" + activityovertime +
                ", applystarttime=" + applystarttime +
                ", applyovertime=" + applyovertime +
                ", maxman=" + maxman +
                ", content='" + content + '\'' +
                '}';
    }

    private Long state;

    private String cover;

    private Date activitystarttime;

    private Date activityovertime;

    private Date applystarttime;

    private Date applyovertime;

    private Long maxman;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getLever() {
        return lever;
    }

    public void setLever(Long lever) {
        this.lever = lever;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Date getActivitystarttime() {
        return activitystarttime;
    }

    public void setActivitystarttime(Date activitystarttime) {
        this.activitystarttime = activitystarttime;
    }

    public Date getActivityovertime() {
        return activityovertime;
    }

    public void setActivityovertime(Date activityovertime) {
        this.activityovertime = activityovertime;
    }

    public Date getApplystarttime() {
        return applystarttime;
    }

    public void setApplystarttime(Date applystarttime) {
        this.applystarttime = applystarttime;
    }

    public Date getApplyovertime() {
        return applyovertime;
    }

    public void setApplyovertime(Date applyovertime) {
        this.applyovertime = applyovertime;
    }

    public Long getMaxman() {
        return maxman;
    }

    public void setMaxman(Long maxman) {
        this.maxman = maxman;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}