package com.m78.entity;

public class CommunitCarport {
    private Long id;

    private Long communitid;

    private Long carportid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommunitid() {
        return communitid;
    }

    public void setCommunitid(Long communitid) {
        this.communitid = communitid;
    }

    public Long getCarportid() {
        return carportid;
    }

    public void setCarportid(Long carportid) {
        this.carportid = carportid;
    }

    @Override
    public String toString() {
        return "CommunitCarport{" +
                "id=" + id +
                ", communitid=" + communitid +
                ", carportid=" + carportid +
                '}';
    }
}