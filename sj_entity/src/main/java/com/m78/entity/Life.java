package com.m78.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class Life implements Serializable {

    private Long id;

    private String name;

    private String imgs;
    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    private Date time;

    private String adress;

    private Long optionid;
    private  LifeOption lifeOption;

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
        this.name = name;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Long getOptionid() {
        return optionid;
    }

    public void setOptionid(Long optionid) {
        this.optionid = optionid;
    }

    public LifeOption getLifeOption() {
        return lifeOption;
    }

    public void setLifeOption(LifeOption lifeOption) {
        this.lifeOption = lifeOption;
    }

    @Override
    public String toString() {
        return "Life{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imgs='" + imgs + '\'' +
                ", time=" + time +
                ", adress='" + adress + '\'' +
                ", optionid=" + optionid +
                ", lifeOption=" + lifeOption +
                '}';
    }
}