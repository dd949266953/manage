package com.m78.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class HouseCharitem implements Serializable {
    private Long id;

    private Long charitemid;

    private Long houseid;

}