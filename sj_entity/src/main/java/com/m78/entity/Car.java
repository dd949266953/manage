package com.m78.entity;

import java.io.Serializable;

public class Car implements Serializable {
    private Long carid;

    private String ownername;

    private String ownerphone;

    private String carnumber;

    private Double cardisplacement;

    public Long getCarid() {
        return carid;
    }

    public void setCarid(Long carid) {
        this.carid = carid;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername == null ? null : ownername.trim();
    }

    public String getOwnerphone() {
        return ownerphone;
    }

    public void setOwnerphone(String ownerphone) {
        this.ownerphone = ownerphone == null ? null : ownerphone.trim();
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public Double getCardisplacement() {
        return cardisplacement;
    }

    public void setCardisplacement(Double cardisplacement) {
        this.cardisplacement = cardisplacement;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carid=" + carid +
                ", ownername='" + ownername + '\'' +
                ", ownerphone='" + ownerphone + '\'' +
                ", carnumber='" + carnumber + '\'' +
                ", cardisplacement=" + cardisplacement +
                '}';
    }
}