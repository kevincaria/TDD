package com.obj2;

public class Punto {
    private Integer x;
    private Integer y;

    public Punto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void mover(Integer deltaX, Integer deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

}
