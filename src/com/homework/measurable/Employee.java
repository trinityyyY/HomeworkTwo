package com.homework.measurable;

public class Employee implements Measurable{
    private double salary;
    private String name;

    public Employee (double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
