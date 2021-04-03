package com.homework.point;

public class MyPoint {
    private final double x;
    private final double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint translate(double x, double y) {
        return new MyPoint(this.x + x,this.y + y);
    }

    public MyPoint scale(double factor) {
        return new MyPoint(this.x * factor, this.y * factor);
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
