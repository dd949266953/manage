package com.m78.entity;

public class ChargeitemHouse {
    private Long id;

    private Long chargeitemid;

    private Long houseid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChargeitemid() {
        return chargeitemid;
    }

    public void setChargeitemid(Long chargeitemid) {
        this.chargeitemid = chargeitemid;
    }

    public Long getHouseid() {
        return houseid;
    }

    public void setHouseid(Long houseid) {
        this.houseid = houseid;
    }

    @Override
    public String toString() {
        return "ChargeitemHouse{" +
                "id=" + id +
                ", chargeitemid=" + chargeitemid +
                ", houseid=" + houseid +
                '}';
    }
}