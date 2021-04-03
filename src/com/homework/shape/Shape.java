package com.homework.shape;

import com.homework.point.MyPointMutator;

public abstract class Shape {
    protected MyPointMutator point = new MyPointMutator(0 ,0);

    public Shape(MyPointMutator point) {
        this.point.setX(point.getX());
        this.point.setY(point.getY());
    }

    public void moveBy(double dx, double dy) {
        point.addX(dx);
        point.addY(dy);
    }

    public abstract MyPointMutator getCenter();

}
