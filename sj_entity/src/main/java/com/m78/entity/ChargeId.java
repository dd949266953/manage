package com.m78.entity;

public class ChargeId {
    private Long id;

    private Long chargeitemid;

    private Long billid;

    private Long signid;

    private Long type;

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

    public Long getBillid() {
        return billid;
    }

    public void setBillid(Long billid) {
        this.billid = billid;
    }

    public Long getSignid() {
        return signid;
    }

    public void setSignid(Long signid) {
        this.signid = signid;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ChargeId{" +
                "id=" + id +
                ", chargeitemid=" + chargeitemid +
                ", billid=" + billid +
                ", signid=" + signid +
                ", type=" + type +
                '}';
    }
}