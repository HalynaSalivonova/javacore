package com.kitcenter.app.classwork.lesson5;


public class Calculator {
    public static double sum(double numberOne, double numberTwo){
        double result = numberOne + numberTwo;
        return result;
        //return numberOne + numberTwo;
    }

    public double substract(double numberOne, double numberTwo){
        double result = numberOne - numberTwo;
        return result;
    }

    public double multiplication(double numberOne, double numberTwo){
        double result = numberOne * numberTwo;
        return result;
    }

    public double divicion(double numberOne, double numberTwo){
        double result;
        if (numberTwo == 0){
            result = 0;
            System.out.println("Incorrect input parameters");
        } else {
            result = numberOne / numberTwo;
        }
        return result;
    }
}
