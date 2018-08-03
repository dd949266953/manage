package com.m78.vo;

import java.io.Serializable;


public class BuildingVo implements Serializable {
    private Long id;

    private Long communityId;

    private String communityName;

    private String name;

    private Long unittotal;

    private Long pliestotal;

    private String buildingtype;

    private String buildingstructure;

    private String orientation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getBuildingtype() {
        return buildingtype;
    }

    public void setBuildingtype(String buildingtype) {
        this.buildingtype = buildingtype;
    }

    public String getBuildingstructure() {
        return buildingstructure;
    }

    public void setBuildingstructure(String buildingstructure) {
        this.buildingstructure = buildingstructure;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return "BuildingVo{" +
                "id=" + id +
                ", communityName='" + communityName + '\'' +
                ", name='" + name + '\'' +
                ", unittotal=" + unittotal +
                ", pliestotal=" + pliestotal +
                ", buildingtype='" + buildingtype + '\'' +
                ", buildingstructure='" + buildingstructure + '\'' +
                ", orientation='" + orientation + '\'' +
                '}';
    }
}
