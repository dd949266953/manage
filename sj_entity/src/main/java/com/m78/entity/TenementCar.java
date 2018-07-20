package com.m78.entity;

import java.io.Serializable;

public class TenementCar implements Serializable {
    private Long id;

    private Long tenementid;

    private Long carid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTenementid() {
        return tenementid;
    }

    public void setTenementid(Long tenementid) {
        this.tenementid = tenementid;
    }

    public Long getCarid() {
        return carid;
    }

    public void setCarid(Long carid) {
        this.carid = carid;
    }

    @Override
    public String toString() {
        return "TenementCar{" +
                "id=" + id +
                ", tenementid=" + tenementid +
                ", carid=" + carid +
                '}';
    }
}