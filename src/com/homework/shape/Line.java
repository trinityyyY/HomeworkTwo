package com.homework.shape;

import com.homework.point.MyPointMutator;

public class Line extends Shape implements Cloneable{
    private MyPointMutator to = new MyPointMutator(0, 0);

    public Line(MyPointMutator from, MyPointMutator to) {
        super(from);
        this.to.setX(to.getX());
        this.to.setY(to.getY());
    }

    @Override
    public void moveBy(double dx, double dy) {
        super.moveBy(dx, dy);
        this.to.addX(dx);
        this.to.addY(dy);
    }

    public MyPointMutator getCenter() {
        MyPointMutator center = new MyPointMutator((this.point.getX() + to.getX())/2,
                                                   (this.point.getY() + to.getY())/2);
        return center;
    }

    @Override
    public Line clone() {
        return new Line(new MyPointMutator(point.getX(), point.getY()),new MyPointMutator(to.getX(), to.getY()));
    }

    @Override
    public String toString() {
        return "Line{" +
                "to=" + to +
                ", point=" + point +
                '}';
    }
}
