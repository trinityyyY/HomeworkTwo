package com.homework;

import com.homework.car.MyCar;
import com.homework.measurable.Employee;
import com.homework.measurable.Measurable;
import com.homework.point.MyPoint;
import com.homework.point.MyPointMutator;
import com.homework.shape.Circle;
import com.homework.shape.Line;
import com.homework.shape.Rectangle;
import com.homework.shape.Shape;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static BigInteger fact(int x) {
        BigInteger result = BigInteger.valueOf(x);
        if (x > 1) {
            result = result.multiply(fact(x-1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("--Chapter 1");
        System.out.println("----Exercises 1----");
        System.out.print("Enter integer number: ");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();

        String str = Integer.toString(value, 2);
        String str2 = Integer.toString(value, 8);
        String str3 = Integer.toString(value, 16);
        System.out.println("binary = " + str +  "  Octal = " + str2 + "  hexadecimal = " + str3);
        System.out.println("reciprocal = " + 1.0/value);
        String string = Double.toHexString(1.0/value);
        System.out.println("hex reciprocal = " + string);

        System.out.println("----Exercises 2----");
        System.out.print("Enter the angle: ");
        int angle = in.nextInt();
        System.out.println("% = " + (angle % 360 + 360) % 360);
        System.out.println("floorMod = " + Math.floorMod(angle, 360));

        System.out.println("----Exercises 3----");
        System.out.println("Enter 3 int number");
        System.out.print("number 1 = ");
        int number1 = in.nextInt();
        System.out.print("number 2 = ");
        int number2 = in.nextInt();
        System.out.print("number 3 = ");
        int number3 = in.nextInt();
        int max = number1;
        if (number2 > max && number2 > number3) {
            max = number2;
        }else if (number3 > max ) {
            max = number3;
        }
        System.out.println("Max = " + max);
        System.out.println("Max for use Math.max = " + Math.max(number1, (Math.max(number2,number3))));

        System.out.println("----Exercises 4----");
        double v = Math.nextUp(Double.MAX_VALUE);
        System.out.println(v);
        System.out.println("MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("MAX_VALUE neg: " + -Double.MAX_VALUE);
        System.out.println("MIN_VALUE: " + Math.nextDown(-Double.MAX_VALUE));
        System.out.println(Math.nextUp(0.0));
        System.out.println(Math.nextUp(-1.0));

        System.out.println("----Exercises 6----");
        System.out.print("Enter number to factorial = ");
        int fNum = in.nextInt();
        System.out.println("fact = " + fact(fNum));

        System.out.println("----Exercises 13----");
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] combination = new int[6];
        int index;
        for (int i = 1; i < 50; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < 6; i++) {
            index = (int)(Math.random() * (49 - i));
            combination[i] = numbers.remove(index);
        }
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 5-i; j++){
                if (combination[j] > combination[j+1]){
                    int temp = combination[j+1];
                    combination[j+1] = combination[j];
                    combination[j] = temp;
                }
            }
        }
        System.out.print("combination =");
        for (int i = 0; i < 6; i++){
            System.out.print(" " + combination[i]);
        }

        System.out.println("\n--Chapter 2");
        System.out.println("----Exercises 5----");
        MyPoint p = new MyPoint(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);

        System.out.println("----Exercises 6----");
        MyPointMutator pM = new MyPointMutator(3, 4);
        pM.translate(12, 6.7);
        pM.scale(0.8);
        System.out.println(pM);

        System.out.println("----Exercises 9----");
        MyCar car = new MyCar(2);
        car.refuel(5);
        System.out.println(car);
        car.drive(5);
        System.out.println(car.getFuelLevel());
        System.out.println(car);

        System.out.println("--Chapter 3");
        System.out.println("----Exercises 1----");
        Measurable[] employees = {
                new Employee(1000, "peter"),
                new Employee(3000, "dima"),
                new Employee(2500, "zhenya")
        };
        System.out.println("average salary = " + Measurable.average(employees));
        System.out.println("----Exercises 2----");
        System.out.println("largest salary = " + ((Employee)Measurable.largest(employees)).getName());

        System.out.println("--Chapter 4");
        System.out.println("----Exercises 4----");
        Shape figure = new Circle(new MyPointMutator(1.0,1.0), 2.5);
        figure.moveBy(5,6.5);
        System.out.println("center Circle = " + figure.getCenter());

        figure = new Rectangle(new MyPointMutator(0,7), 4, 5);
        figure.moveBy(2, -6.5);
        System.out.println("center Rectangle = " + figure.getCenter());

        figure = new Line(new MyPointMutator(1, 1), new MyPointMutator(3, 3));
        figure.moveBy(5, 1);
        System.out.println("center Line = " + figure.getCenter());

        System.out.println("----Exercises 5----");
        Circle c1 = new Circle(new MyPointMutator(1,1), 3);
        Circle c2 = c1.clone();
        c1.moveBy(2,2);
        System.out.println(c1 + "\n" + c2);

        Rectangle r1 = new Rectangle(new MyPointMutator(1, 1),1 ,1);
        Rectangle r2 = r1.clone();
        r1.moveBy(2,2);
        System.out.println(r1 + "\n" + r2);

        Line l1 = new Line(new MyPointMutator(1,1), new MyPointMutator(2, 2));
        Line l2 = l1.clone();
        l1.moveBy(2,2);
        System.out.println(l1 + "\n" + l2);
    }
}
