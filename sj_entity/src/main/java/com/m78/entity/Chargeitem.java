package com.m78.entity;

public class Chargeitem {
    private Long id;

    private String name;

    private Long type;

    @Override
    public String toString() {
        return "Chargeitem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", periodtime=" + periodtime +
                ", price=" + price +
                ", cashprice=" + cashprice +
                '}';
    }

    private Long periodtime;

    private Double price;

    private Long cashprice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getPeriodtime() {
        return periodtime;
    }

    public void setPeriodtime(Long periodtime) {
        this.periodtime = periodtime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getCashprice() {
        return cashprice;
    }

    public void setCashprice(Long cashprice) {
        this.cashprice = cashprice;
    }
}