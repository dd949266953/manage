package com.m78.entity;

import java.io.Serializable;

public class TenementCarport implements Serializable {
    private Long id;

    private Long tentmentid;

    private Long carportid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTentmentid() {
        return tentmentid;
    }

    public void setTentmentid(Long tentmentid) {
        this.tentmentid = tentmentid;
    }

    public Long getCarportid() {
        return carportid;
    }

    public void setCarportid(Long carportid) {
        this.carportid = carportid;
    }

    @Override
    public String toString() {
        return "TenementCarport{" +
                "id=" + id +
                ", tentmentid=" + tentmentid +
                ", carportid=" + carportid +
                '}';
    }
}