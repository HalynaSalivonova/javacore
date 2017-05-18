package com.kitcenter.runners.homework.lesson6;


import com.kitcenter.runners.classwork.lesson6.CompareRunner;
import com.kitcenter.runners.classwork.lesson6.TriangleRunner;
import com.kitcenter.runners.classwork.lesson6.NumberRunner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("For work with CompareNumbers press 1");
            System.out.println("For work with NumberEven press 2");
            System.out.println("For work with Triangle press 3");
            System.out.println("For exit press 4");

            int classNum;

            try {
                classNum = scanner.nextInt();
            } catch(InputMismatchException exception){
                System.out.println("Incorrect data was enter. Please use double");
                continue;
            }

            if (classNum == 1) {
                    System.out.println("You selected CompareNumbers.");
                    System.out.println("Please, type two numbers.");
                    CompareRunner.run();
                } else if (classNum == 2) {
                    System.out.println("You selected NumberEven.");
                    System.out.println("Please, type any number.");
                    NumberRunner.run();
                } else if (classNum == 3) {
                    System.out.println("You selected Triangle.");
                    System.out.println("Please, type three numbers.");
                    TriangleRunner.run();
                } else {
                    return;
                }
        }
    }
}
