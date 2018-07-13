package com.m78.entity;


import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Date;

public class Bill implements Serializable {
    private Long id;

    private Long state;

    private String remark;

    private Long chargeuser;
    private Admin admin;

    private Date time;

    private Long informs;

    @JSONField(format="yyyy-MM-dd")
    private Date starttime;
    @JSONField(format="yyyy-MM-dd")
    private Date overtime;

    private Double consume;

    private Double moneys;

    private Long communityid;
    private  Community community;

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public Admin getAdmin() {

        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

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
    //收费类型（车位或者房屋）
    private  Long type;

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getTentmentName() {
        return tentmentName;
    }

    public void setTentmentName(String tentmentName) {
        this.tentmentName = tentmentName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getSignId() {
        return signId;
    }

    public void setSignId(Long signId) {
        this.signId = signId;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                ", chargeuser=" + chargeuser +
                ", admin=" + admin +
                ", time=" + time +
                ", informs=" + informs +
                ", starttime=" + starttime +
                ", overtime=" + overtime +
                ", consume=" + consume +
                ", moneys=" + moneys +
                ", communityid=" + communityid +
                ", community=" + community +
                ", charName='" + charName + '\'' +
                ", tentmentName='" + tentmentName + '\'' +
                ", phone='" + phone + '\'' +
                ", price=" + price +
                ", signId=" + signId +
                ", type=" + type +
                '}';
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

    public Long getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Long communityid) {
        this.communityid = communityid;
    }
}