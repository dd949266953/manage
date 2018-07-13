package com.m78.entity;

public class BillHousenumber {
    private Long id;

    private Long billid;

    private Long housenumbe;

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

    public Long getHousenumbe() {
        return housenumbe;
    }

    public void setHousenumbe(Long housenumbe) {
        this.housenumbe = housenumbe;
    }

    @Override
    public String toString() {
        return "BillHousenumber{" +
                "id=" + id +
                ", billid=" + billid +
                ", housenumbe=" + housenumbe +
                '}';
    }
}