package com.m78.entity;

import java.util.Date;

public class Advertising {
    private Long id;

    private String title;

    private Date starttime;

    private Date stoptime;

    private Long type;

    private String imgs;

    private String href;

    private String describe;

    private String recommendtitle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getStoptime() {
        return stoptime;
    }

    public void setStoptime(Date stoptime) {
        this.stoptime = stoptime;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getRecommendtitle() {
        return recommendtitle;
    }

    public void setRecommendtitle(String recommendtitle) {
        this.recommendtitle = recommendtitle == null ? null : recommendtitle.trim();
    }

    @Override
    public String toString() {
        return "Advertising{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", starttime=" + starttime +
                ", stoptime=" + stoptime +
                ", type=" + type +
                ", imgs='" + imgs + '\'' +
                ", href='" + href + '\'' +
                ", describe='" + describe + '\'' +
                ", recommendtitle='" + recommendtitle + '\'' +
                '}';
    }
}