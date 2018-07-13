package com.m78.entity;

public class ChargeitemCarport {
    private Long id;

    private Long carportid;

    private Long chargeitemid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ChargeitemCarport{" +
                "id=" + id +
                ", carportid=" + carportid +
                ", chargeitemid=" + chargeitemid +
                '}';
    }

    public Long getCarportid() {
        return carportid;
    }

    public void setCarportid(Long carportid) {
        this.carportid = carportid;
    }

    public Long getChargeitemid() {
        return chargeitemid;
    }

    public void setChargeitemid(Long chargeitemid) {
        this.chargeitemid = chargeitemid;
    }
}