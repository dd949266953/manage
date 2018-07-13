package com.m78.entity;

import java.io.Serializable;

public class Community implements Serializable {
    private Long id;

    private String name;

    private String address;

    private String detailaddress;

    private String servicetel;

    private String leader;

    private String leaderphone;

    private String logo;

    private String backgroundimage;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }

    public String getServicetel() {
        return servicetel;
    }

    public void setServicetel(String servicetel) {
        this.servicetel = servicetel == null ? null : servicetel.trim();
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    public String getLeaderphone() {
        return leaderphone;
    }

    public void setLeaderphone(String leaderphone) {
        this.leaderphone = leaderphone == null ? null : leaderphone.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getBackgroundimage() {
        return backgroundimage;
    }

    public void setBackgroundimage(String backgroundimage) {
        this.backgroundimage = backgroundimage == null ? null : backgroundimage.trim();
    }

    @Override
    public String toString() {
        return "Community{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", detailaddress='" + detailaddress + '\'' +
                ", servicetel='" + servicetel + '\'' +
                ", leader='" + leader + '\'' +
                ", leaderphone='" + leaderphone + '\'' +
                ", logo='" + logo + '\'' +
                ", backgroundimage='" + backgroundimage + '\'' +
                '}';
    }
}