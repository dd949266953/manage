package com.m78.entity;

import java.io.Serializable;

public class Building implements Serializable {
    private Long id;

    private String name;

    private Long unittotal;

    private Long pliestotal;

    private Long buildingtype;

    private String buildingstructure;

    private String orientation;

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

    public Long getUnittotal() {
        return unittotal;
    }

    public void setUnittotal(Long unittotal) {
        this.unittotal = unittotal;
    }

    public Long getPliestotal() {
        return pliestotal;
    }

    public void setPliestotal(Long pliestotal) {
        this.pliestotal = pliestotal;
    }

    public Long getBuildingtype() {
        return buildingtype;
    }

    public void setBuildingtype(Long buildingtype) {
        this.buildingtype = buildingtype;
    }

    public String getBuildingstructure() {
        return buildingstructure;
    }

    public void setBuildingstructure(String buildingstructure) {
        this.buildingstructure = buildingstructure == null ? null : buildingstructure.trim();
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation == null ? null : orientation.trim();
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unittotal=" + unittotal +
                ", pliestotal=" + pliestotal +
                ", buildingtype=" + buildingtype +
                ", buildingstructure='" + buildingstructure + '\'' +
                ", orientation='" + orientation + '\'' +
                '}';
    }
}