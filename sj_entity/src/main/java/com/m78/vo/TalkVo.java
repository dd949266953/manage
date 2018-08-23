package com.m78.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TalkVo implements Serializable {
    private Long id;
    private String title;
    private Long tenementId;
    private String tenementName;
    private Long stateId;
    private String state;
    private Date time;
    private Long typeId;
    private String type;
    private String pictures;
}
