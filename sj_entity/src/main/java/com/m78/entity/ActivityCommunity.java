package com.m78.entity;

public class ActivityCommunity {
    private Long id;

    private Long activityid;

    private Long communityid;

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

    public Long getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Long communityid) {
        this.communityid = communityid;
    }

    @Override
    public String toString() {
        return "ActivityCommunity{" +
                "id=" + id +
                ", activityid=" + activityid +
                ", communityid=" + communityid +
                '}';
    }
}