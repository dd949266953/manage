package com.m78.entity;

import java.io.Serializable;

public class DicionaryType implements Serializable {
    private Long id;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        return "DicionaryType{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}