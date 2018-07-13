package com.m78.entity;

import java.io.Serializable;
import java.util.Date;

public class Bill implements Serializable {
    private Long id;

    private Long state;

    private String remark;

    private Long chargeuser;

    private Date time;

    private Long informs;

    private Date starttime;

    private Date overtime;

    private Double consume;

    private Double moneys;
    //小区名字
    private  String communityName;
    //收费项目
    private  String charName;
    //住户
    private  String tentmentName;
    //电话
    private  String phone;
    //单价
    private  double price;
    //房号或者车位号
    private  Long signId;

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                ", chargeuser=" + chargeuser +
                ", time=" + time +
                ", informs=" + informs +
                ", starttime=" + starttime +
                ", overtime=" + overtime +
                ", consume=" + consume +
                ", moneys=" + moneys +
                ", communityName='" + communityName + '\'' +
                ", charName='" + charName + '\'' +
                ", tentmentName='" + tentmentName + '\'' +
                ", phone='" + phone + '\'' +
                ", price=" + price +
                ", signId=" + signId +
                '}';
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getChargeuser() {
        return chargeuser;
    }

    public void setChargeuser(Long chargeuser) {
        this.chargeuser = chargeuser;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getInforms() {
        return informs;
    }

    public void setInforms(Long informs) {
        this.informs = informs;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getOvertime() {
        return overtime;
    }

    public void setOvertime(Date overtime) {
        this.overtime = overtime;
    }

    public Double getConsume() {
        return consume;
    }

    public void setConsume(Double consume) {
        this.consume = consume;
    }

    public Double getMoneys() {
        return moneys;
    }

    public void setMoneys(Double moneys) {
        this.moneys = moneys;
    }
}