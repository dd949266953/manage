package com.m78.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class HouseTentment implements Serializable {
    private Long id;

    private Long houseid;

    private Long tentmentid;

    private Long relationid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHouseid() {
        return houseid;
    }

    public void setHouseid(Long houseid) {
        this.houseid = houseid;
    }

    public Long getTentmentid() {
        return tentmentid;
    }

    public void setTentmentid(Long tentmentid) {
        this.tentmentid = tentmentid;
    }

    public Long getRelationid() {
        return relationid;
    }

    public void setRelationid(Long relationid) {
        this.relationid = relationid;
    }
}