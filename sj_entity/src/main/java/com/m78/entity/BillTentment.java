package com.m78.entity;

public class BillTentment {
    private Long id;

    private Long billid;

    private Long tentmentid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBillid() {
        return billid;
    }

    public void setBillid(Long billid) {
        this.billid = billid;
    }

    public Long getTentmentid() {
        return tentmentid;
    }

    public void setTentmentid(Long tentmentid) {
        this.tentmentid = tentmentid;
    }

    @Override
    public String toString() {
        return "BillTentment{" +
                "id=" + id +
                ", billid=" + billid +
                ", tentmentid=" + tentmentid +
                '}';
    }
}