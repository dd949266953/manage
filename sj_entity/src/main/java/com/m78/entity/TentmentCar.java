package com.m78.entity;

public class TentmentCar {
    private Long id;

    private Long tentmentid;

    private Long carid;

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

    public Long getCarid() {
        return carid;
    }

    public void setCarid(Long carid) {
        this.carid = carid;
    }

    @Override
    public String toString() {
        return "TentmentCar{" +
                "id=" + id +
                ", tentmentid=" + tentmentid +
                ", carid=" + carid +
                '}';
    }
}