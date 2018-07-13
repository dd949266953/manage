package com.m78.entity;

public class Carousel {
    private Long id;

    private Long width;

    private Long height;

    private Long animation;

    @Override
    public String toString() {
        return "Carousel{" +
                "id=" + id +
                ", width=" + width +
                ", height=" + height +
                ", animation=" + animation +
                ", arrows=" + arrows +
                ", indicator=" + indicator +
                ", switchover=" + switchover +
                ", time=" + time +
                '}';
    }

    private Long arrows;

    private Long indicator;

    private Long switchover;

    private Long time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getAnimation() {
        return animation;
    }

    public void setAnimation(Long animation) {
        this.animation = animation;
    }

    public Long getArrows() {
        return arrows;
    }

    public void setArrows(Long arrows) {
        this.arrows = arrows;
    }

    public Long getIndicator() {
        return indicator;
    }

    public void setIndicator(Long indicator) {
        this.indicator = indicator;
    }

    public Long getSwitchover() {
        return switchover;
    }

    public void setSwitchover(Long switchover) {
        this.switchover = switchover;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}