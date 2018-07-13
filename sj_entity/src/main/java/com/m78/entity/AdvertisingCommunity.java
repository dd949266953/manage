package com.m78.entity;

public class AdvertisingCommunity {
    private Long id;

    private Long advertisingid;

    private Long communityid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAdvertisingid() {
        return advertisingid;
    }

    public void setAdvertisingid(Long advertisingid) {
        this.advertisingid = advertisingid;
    }

    public Long getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Long communityid) {
        this.communityid = communityid;
    }

    @Override
    public String toString() {
        return "AdvertisingCommunity{" +
                "id=" + id +
                ", advertisingid=" + advertisingid +
                ", communityid=" + communityid +
                '}';
    }
}