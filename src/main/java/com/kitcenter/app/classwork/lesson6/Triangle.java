package com.kitcenter.app.classwork.lesson6;


public class Triangle {
    public  static boolean isRightTriangles(double a, double b, double c){
        if(a == b){
            return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
        } else if(a == c){
            return  Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2);
        } else if(c == b){
            return  Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
        }

        if(a > b){
            if(a > c){
                return  Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
            } else {
                return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
            }
        } else {
            if(b > c){
                return  Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2);
            } else {
                return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
            }
        }
    }
}
