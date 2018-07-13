package com.m78.entity;

import java.util.Date;

public class House {
    private Long houseid;

    private Long unitnumber;

    private Long fool;

    private Double area;

    private Long housetype;

    private Double inarea;

    private Double publicarea;

    private Date returntime;

    private Long state;

    private Long equity;

    public Long getHouseid() {
        return houseid;
    }

    public void setHouseid(Long houseid) {
        this.houseid = houseid;
    }

    public Long getUnitnumber() {
        return unitnumber;
    }

    public void setUnitnumber(Long unitnumber) {
        this.unitnumber = unitnumber;
    }

    public Long getFool() {
        return fool;
    }

    public void setFool(Long fool) {
        this.fool = fool;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Long getHousetype() {
        return housetype;
    }

    public void setHousetype(Long housetype) {
        this.housetype = housetype;
    }

    public Double getInarea() {
        return inarea;
    }

    public void setInarea(Double inarea) {
        this.inarea = inarea;
    }

    public Double getPublicarea() {
        return publicarea;
    }

    public void setPublicarea(Double publicarea) {
        this.publicarea = publicarea;
    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Long getEquity() {
        return equity;
    }

    public void setEquity(Long equity) {
        this.equity = equity;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseid=" + houseid +
                ", unitnumber=" + unitnumber +
                ", fool=" + fool +
                ", area=" + area +
                ", housetype=" + housetype +
                ", inarea=" + inarea +
                ", publicarea=" + publicarea +
                ", returntime=" + returntime +
                ", state=" + state +
                ", equity=" + equity +
                '}';
    }
}