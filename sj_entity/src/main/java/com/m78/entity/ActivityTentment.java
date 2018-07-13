package com.m78.entity;

public class ActivityTentment {
    private Long id;

    private Long activityid;

    private Long tentmentid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityid() {
        return activityid;
    }

    public void setActivityid(Long activityid) {
        this.activityid = activityid;
    }

    public Long getTentmentid() {
        return tentmentid;
    }

    public void setTentmentid(Long tentmentid) {
        this.tentmentid = tentmentid;
    }

    @Override
    public String toString() {
        return "ActivityTentment{" +
                "id=" + id +
                ", activityid=" + activityid +
                ", tentmentid=" + tentmentid +
                '}';
    }
}