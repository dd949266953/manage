package com.m78.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class Noticetype implements Serializable {
    private Long id;

    private String typename;
    @JSONField(format="yyyy-MM-dd hh:mm:ss")
    private Date createtime;

    private Long count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }


    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Noticetype{" +
                "id=" + id +
                ", typename='" + typename + '\'' +
                ", createtime=" + createtime +
                ", count=" + count +
                '}';
    }
}