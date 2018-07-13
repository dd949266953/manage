package com.m78.entity;

public class VoteTentment {
    private Long id;

    private Long voteid;

    private Long tentmentid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVoteid() {
        return voteid;
    }

    public void setVoteid(Long voteid) {
        this.voteid = voteid;
    }

    public Long getTentmentid() {
        return tentmentid;
    }

    public void setTentmentid(Long tentmentid) {
        this.tentmentid = tentmentid;
    }

    @Override
    public String toString() {
        return "VoteTentment{" +
                "id=" + id +
                ", voteid=" + voteid +
                ", tentmentid=" + tentmentid +
                '}';
    }
}