package com.m78.entity;

public class CarCarport {
    private Long id;

    private Long carid;

    private Long carportid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarid() {
        return carid;
    }

    public void setCarid(Long carid) {
        this.carid = carid;
    }

    public Long getCarportid() {
        return carportid;
    }

    public void setCarportid(Long carportid) {
        this.carportid = carportid;
    }

    @Override
    public String toString() {
        return "CarCarport{" +
                "id=" + id +
                ", carid=" + carid +
                ", carportid=" + carportid +
                '}';
    }
}