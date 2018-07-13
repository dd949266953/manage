package com.m78.entity;

public class CommunityNotice {
    private Long id;

    private Long communityid;

    private Long noticeid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Long communityid) {
        this.communityid = communityid;
    }

    public Long getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Long noticeid) {
        this.noticeid = noticeid;
    }

    @Override
    public String toString() {
        return "CommunityNotice{" +
                "id=" + id +
                ", communityid=" + communityid +
                ", noticeid=" + noticeid +
                '}';
    }
}