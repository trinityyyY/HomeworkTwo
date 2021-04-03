package com.homework.shape;

import com.homework.point.MyPointMutator;

public class Rectangle extends Shape implements Cloneable{
    private double width;
    private double height;

    public Rectangle(MyPointMutator topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    public MyPointMutator getCenter() {
        MyPointMutator center = new MyPointMutator(this.point.getX()+width/2, this.point.getY()+height/2);
        return center;
    }

    @Override
    public Rectangle clone(){
        return new Rectangle(new MyPointMutator(point.getX(),point.getY()), width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", point=" + point +
                '}';
    }
}
