package com.m78.entity;

public class VoteOption {
    private Long id;

    private String optionname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptionname() {
        return optionname;
    }

    public void setOptionname(String optionname) {
        this.optionname = optionname == null ? null : optionname.trim();
    }

    @Override
    public String toString() {
        return "VoteOption{" +
                "id=" + id +
                ", optionname='" + optionname + '\'' +
                '}';
    }
}