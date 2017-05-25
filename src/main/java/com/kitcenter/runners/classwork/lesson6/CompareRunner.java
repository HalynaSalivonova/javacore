package com.kitcenter.runners.classwork.lesson6;


import com.kitcenter.app.classwork.lesson6.CompareNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompareRunner {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        System.out.println("Please, type two numbers.");
        Scanner scanner = new Scanner(System.in);
        try {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            Boolean result = CompareNumbers.isBigger(a, b);

//            System.out.println(a > b ? a : b); operation if-? else-:
           if(result == null){
                System.out.println("Number: " + b + " is equals: " + a);
           } else if(result) {
                System.out.println("Number: " + a + " is bigger than: " + b);
           } else {
                System.out.println("Number: " + b + " is bigger than: " + a);
            }
        } catch(InputMismatchException exception){
            System.out.println("Incorrect input parameters. Please enter double");
        }
    }
}
