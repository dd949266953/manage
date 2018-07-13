package com.m78.entity;

public class Noticetype {
    private Long id;

    private Long typename;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypename() {
        return typename;
    }

    public void setTypename(Long typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        return "Noticetype{" +
                "id=" + id +
                ", typename=" + typename +
                '}';
    }
}