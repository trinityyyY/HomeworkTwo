package com.homework.shape;

import com.homework.point.MyPointMutator;

public class Circle extends Shape implements Cloneable{
    private double radius;

    public Circle(MyPointMutator point, double radius){
        super(point);
        this.radius = radius;
    }

    @Override
    public MyPointMutator getCenter() {
        return this.point;
    }

    @Override
    public Circle clone() {
        return new Circle(new MyPointMutator(point.getX(), point.getY()), radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", point=" + point +
                '}';
    }
}
