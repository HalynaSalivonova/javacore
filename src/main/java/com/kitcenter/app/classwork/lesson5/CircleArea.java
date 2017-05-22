package com.kitcenter.app.classwork.lesson5;


public class CircleArea {
    public double getArea(double radius){
        if(radius <= 0){
            throw new IllegalArgumentException("Values of radius1 or radius2 is negative or equals zero");
        } else {
            return Math.PI * Math.pow(radius, 2);
        }
    }

    public static Boolean calculate(double circleArea1, double circleArea2){
        if(circleArea1 <= 0 || circleArea2 <= 0){
            throw new IllegalArgumentException("Values of circleArea1 or circleArea2 is negative or equals zero");
        }
        Boolean result = (circleArea1 == circleArea2);
        if(result){
            return null;
        } else {
            return circleArea1 > circleArea2;
        }
    }
}