package com.homework.point;

public class MyPointMutator {
    private double x = 1.0;
    private double y = 1.0;

    public MyPointMutator() {
    }

    public MyPointMutator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void addX(double x) {
        this.x += x;
    }
    public void addY(double y) {
        this.y += y;
    }

    @Override
    public String toString() {
        return "MyPointMutator{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public MyPointMutator translate(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public MyPointMutator scale(double factor) {
        this.x *= factor;
        this.y *= factor;
        return this;
    }
}
