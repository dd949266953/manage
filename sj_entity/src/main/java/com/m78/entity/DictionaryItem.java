package com.m78.entity;

import java.io.Serializable;

public class DictionaryItem implements Serializable {
    private Long id;

    private String content;

    private Long typeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "DictionaryItem{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", typeId=" + typeId +
                '}';
    }
}