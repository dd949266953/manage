package com.m78.entity;

public class HouseBuliding {
    private Long id;

    private Long buildingid;

    private Long houseid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Long buildingid) {
        this.buildingid = buildingid;
    }

    public Long getHouseid() {
        return houseid;
    }

    public void setHouseid(Long houseid) {
        this.houseid = houseid;
    }

    @Override
    public String toString() {
        return "HouseBuliding{" +
                "id=" + id +
                ", buildingid=" + buildingid +
                ", houseid=" + houseid +
                '}';
    }
}