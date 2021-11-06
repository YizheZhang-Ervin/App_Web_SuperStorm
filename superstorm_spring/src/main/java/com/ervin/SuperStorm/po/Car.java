package com.ervin.SuperStorm.po;

public class Car {
    private Integer frameNUM;
    private Integer carID;
    private String xCen;
    private String yCen;
    private String xHead;
    private String yHead;
    private String xTail;
    private String yTail;
    private String velocity;
    private String accelerate;
    private String carL;

    @Override
    public String toString() {
        return "Car{" +
                "frameNUM=" + frameNUM +
                ", carID=" + carID +
                ", xCen='" + xCen + '\'' +
                ", yCen='" + yCen + '\'' +
                ", xHead='" + xHead + '\'' +
                ", yHead='" + yHead + '\'' +
                ", xTail='" + xTail + '\'' +
                ", yTail='" + yTail + '\'' +
                ", velocity='" + velocity + '\'' +
                ", accelerate='" + accelerate + '\'' +
                ", carL='" + carL + '\'' +
                '}';
    }

    public Integer getFrameNUM() {
        return frameNUM;
    }

    public void setFrameNUM(Integer frameNUM) {
        this.frameNUM = frameNUM;
    }

    public Integer getCarID() {
        return carID;
    }

    public void setCarID(Integer carID) {
        this.carID = carID;
    }

    public String getxCen() {
        return xCen;
    }

    public void setxCen(String xCen) {
        this.xCen = xCen;
    }

    public String getyCen() {
        return yCen;
    }

    public void setyCen(String yCen) {
        this.yCen = yCen;
    }

    public String getxHead() {
        return xHead;
    }

    public void setxHead(String xHead) {
        this.xHead = xHead;
    }

    public String getyHead() {
        return yHead;
    }

    public void setyHead(String yHead) {
        this.yHead = yHead;
    }

    public String getxTail() {
        return xTail;
    }

    public void setxTail(String xTail) {
        this.xTail = xTail;
    }

    public String getyTail() {
        return yTail;
    }

    public void setyTail(String yTail) {
        this.yTail = yTail;
    }

    public String getVelocity() {
        return velocity;
    }

    public void setVelocity(String velocity) {
        this.velocity = velocity;
    }

    public String getAccelerate() {
        return accelerate;
    }

    public void setAccelerate(String accelerate) {
        this.accelerate = accelerate;
    }

    public String getCarL() {
        return carL;
    }

    public void setCarL(String carL) {
        this.carL = carL;
    }



}
