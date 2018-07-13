package com.m78.entity;

public class Childnotice {
    private Long id;

    private String title;

    private String content;

    private Long noticeid;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Long noticeid) {
        this.noticeid = noticeid;
    }

    @Override
    public String toString() {
        return "Childnotice{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", noticeid=" + noticeid +
                '}';
    }
}