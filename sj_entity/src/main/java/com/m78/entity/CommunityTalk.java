package com.m78.entity;

public class CommunityTalk {
    private Long id;

    private Long communityid;

    private Long talkid;

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

    public Long getTalkid() {
        return talkid;
    }

    public void setTalkid(Long talkid) {
        this.talkid = talkid;
    }

    @Override
    public String toString() {
        return "CommunityTalk{" +
                "id=" + id +
                ", communityid=" + communityid +
                ", talkid=" + talkid +
                '}';
    }
}