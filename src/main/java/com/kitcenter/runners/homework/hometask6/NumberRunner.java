package com.kitcenter.runners.homework.hometask6;

import com.kitcenter.app.classwork.lesson6.NumberEven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberRunner {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        System.out.println("Please, type any number.");
        Scanner scanner = new Scanner(System.in);
        try {
            double a = scanner.nextDouble();

            Boolean result = NumberEven.isEven(a);
            if (result == null) {
                System.out.println("It is rather even nor odd number");
            } else if(result){
                System.out.println("Entered number is even");
            } else {
                System.out.println("Entered number is odd");
            }
        } catch(InputMismatchException exception){
            System.out.println("Incorrect input parameters. Please enter double");
        }
    }
}
