package com.m78.entity;

public class HouseTentment {
    private Long id;

    private Long houseid;

    private Long tentmentid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHouseid() {
        return houseid;
    }

    public void setHouseid(Long houseid) {
        this.houseid = houseid;
    }

    public Long getTentmentid() {
        return tentmentid;
    }

    public void setTentmentid(Long tentmentid) {
        this.tentmentid = tentmentid;
    }

    @Override
    public String toString() {
        return "HouseTentment{" +
                "id=" + id +
                ", houseid=" + houseid +
                ", tentmentid=" + tentmentid +
                '}';
    }
}