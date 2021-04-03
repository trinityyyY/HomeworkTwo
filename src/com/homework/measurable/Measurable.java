package com.homework.measurable;

public interface Measurable {
    double getMeasure();
    String getName();
    static double average(Measurable[] arr) {
        double sum = 0.0;
        for (Measurable measurable : arr) {
            sum += measurable.getMeasure();
        }
        return sum/arr.length;
    }

    static Measurable largest(Measurable[] arr) {
        Measurable max = arr[0];
        for (Measurable measurable : arr) {
            if (measurable.getMeasure() > max.getMeasure()) {
                max = measurable;
            }
        }
        return max;
    }
}
