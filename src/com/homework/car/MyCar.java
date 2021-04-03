package com.homework.car;

public class MyCar {
    private double distance = 0.0;
    private double consumption; //miles/gallons
    private double fuelLevel = 0.0;

    public MyCar(double consumption) {
        this.consumption = consumption;
    }

    public void refuel(double gallons) {
        fuelLevel += gallons;
    }

    public void drive(double miles) {
        distance += Math.min(miles, fuelLevel * consumption);
        fuelLevel = Math.max(0, fuelLevel - miles / consumption);
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "distance=" + distance +
                ", consumption=" + consumption +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}
