package com.ervin.SuperStorm.po;

public class Car {
    private Integer id;
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
    private String Lane;
    private String NeighborLane;
    private String ChangeDirection;
    private String density;
    private String occupancyCur;
    private String occupancyNeighborCur;
    private String dFront;
    private String dBack;
    private String vFront;
    private String vBack;
    private String dFrontN;
    private String dBackN;
    private String vFrontN;
    private String vBackN;
    private String relativePos;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLane() {
        return Lane;
    }

    public void setLane(String lane) {
        Lane = lane;
    }

    public String getNeighborLane() {
        return NeighborLane;
    }

    public void setNeighborLane(String neighborLane) {
        NeighborLane = neighborLane;
    }

    public String getChangeDirection() {
        return ChangeDirection;
    }

    public void setChangeDirection(String changeDirection) {
        ChangeDirection = changeDirection;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public String getOccupancyCur() {
        return occupancyCur;
    }

    public void setOccupancyCur(String occupancyCur) {
        this.occupancyCur = occupancyCur;
    }

    public String getOccupancyNeighborCur() {
        return occupancyNeighborCur;
    }

    public void setOccupancyNeighborCur(String occupancyNeighborCur) {
        this.occupancyNeighborCur = occupancyNeighborCur;
    }

    public String getdFront() {
        return dFront;
    }

    public void setdFront(String dFront) {
        this.dFront = dFront;
    }

    public String getdBack() {
        return dBack;
    }

    public void setdBack(String dBack) {
        this.dBack = dBack;
    }

    public String getvFront() {
        return vFront;
    }

    public void setvFront(String vFront) {
        this.vFront = vFront;
    }

    public String getvBack() {
        return vBack;
    }

    public void setvBack(String vBack) {
        this.vBack = vBack;
    }

    public String getdFrontN() {
        return dFrontN;
    }

    public void setdFrontN(String dFrontN) {
        this.dFrontN = dFrontN;
    }

    public String getdBackN() {
        return dBackN;
    }

    public void setdBackN(String dBackN) {
        this.dBackN = dBackN;
    }

    public String getvFrontN() {
        return vFrontN;
    }

    public void setvFrontN(String vFrontN) {
        this.vFrontN = vFrontN;
    }

    public String getvBackN() {
        return vBackN;
    }

    public void setvBackN(String vBackN) {
        this.vBackN = vBackN;
    }

    public String getRelativePos() {
        return relativePos;
    }

    public void setRelativePos(String relativePos) {
        this.relativePos = relativePos;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", frameNUM=" + frameNUM +
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
                ", Lane='" + Lane + '\'' +
                ", NeighborLane='" + NeighborLane + '\'' +
                ", ChangeDirection='" + ChangeDirection + '\'' +
                ", density='" + density + '\'' +
                ", occupancyCur='" + occupancyCur + '\'' +
                ", occupancyNeighborCur='" + occupancyNeighborCur + '\'' +
                ", dFront='" + dFront + '\'' +
                ", dBack='" + dBack + '\'' +
                ", vFront='" + vFront + '\'' +
                ", vBack='" + vBack + '\'' +
                ", dFrontN='" + dFrontN + '\'' +
                ", dBackN='" + dBackN + '\'' +
                ", vFrontN='" + vFrontN + '\'' +
                ", vBackN='" + vBackN + '\'' +
                ", relativePos='" + relativePos + '\'' +
                '}';
    }
}
