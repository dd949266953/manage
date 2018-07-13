package com.m78.entity;

public class CommunityVote {
    private Long id;

    private Long voteid;

    private Long communityid;

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

    public Long getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Long communityid) {
        this.communityid = communityid;
    }

    @Override
    public String toString() {
        return "CommunityVote{" +
                "id=" + id +
                ", voteid=" + voteid +
                ", communityid=" + communityid +
                '}';
    }
}