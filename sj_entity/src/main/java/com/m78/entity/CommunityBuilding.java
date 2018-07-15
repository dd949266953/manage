package com.m78.entity;


public class CommunityBuilding {

    private Long id;

    private Long communitid;

    private Long buildingid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommunitid() {
        return communitid;
    }

    public void setCommunitid(Long communitid) {
        this.communitid = communitid;
    }

    public Long getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Long buildingid) {
        this.buildingid = buildingid;
    }

    @Override
    public String toString() {
        return "CommunityBuilding{" +
                "id=" + id +
                ", communitid=" + communitid +
                ", buildingid=" + buildingid +
                '}';
    }
}