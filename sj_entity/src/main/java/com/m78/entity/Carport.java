package com.m78.entity;

public class Carport {
    private Long carportno;

    private Double area;

    private Long carporttype;

    private Long state;

    private String remark;

    public Long getCarportno() {
        return carportno;
    }

    public void setCarportno(Long carportno) {
        this.carportno = carportno;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Long getCarporttype() {
        return carporttype;
    }

    public void setCarporttype(Long carporttype) {
        this.carporttype = carporttype;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "Carport{" +
                "carportno=" + carportno +
                ", area=" + area +
                ", carporttype=" + carporttype +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                '}';
    }
}