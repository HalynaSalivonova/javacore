package com.kitcenter.app.classwork.lesson5;


import java.util.Scanner;

public class CircleArea {

    public static final double PI = 3.14d;
    public  static void calculate(){
        Scanner scanner = new Scanner(System.in);
        double radius1 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();
        double circleArea1 = PI * Math.pow(radius1, 2); //Math.pow - radius * radius, Math.PI - 3.14.
        double circleArea2 = PI * Math.pow(radius2, 2);
        System.out.println("Area1 is " + circleArea1 + " Area2 is " + circleArea2);

//        if (circleArea1 > circleArea2){
//            System.out.println("circleArea1 is bigger");
//        } else {
//            System.out.println("circleArea2 is bigger");
//        }

        if ((radius1 > radius2) || (circleArea1 > circleArea2)){
            System.out.println("circleArea1 is bigger");
            System.out.println("circleArea2 is smaller");
        } else {
            System.out.println("circleArea2 is bigger");
            System.out.println("circleArea1 is smaller");
        }
    }
}
