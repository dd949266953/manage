package com.m78.entity;

import java.io.Serializable;

public class Chargename implements Serializable {
    private Long id;

    private String name;

    //总条数
    private Long itemsum;

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
        this.name = name;
    }

    public Long getItemsum() {
        return itemsum;
    }

    public void setItemsum(Long itemsum) {
        this.itemsum = itemsum;
    }

    @Override
    public String toString() {
        return "Chargename{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", itemsum=" + itemsum +
                '}';
    }
}