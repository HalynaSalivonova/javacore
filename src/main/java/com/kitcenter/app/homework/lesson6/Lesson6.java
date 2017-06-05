package com.kitcenter.app.homework.lesson6;


import com.kitcenter.runners.homework.hometask6.CompareRunner;
import com.kitcenter.runners.homework.hometask6.TriangleRunner;
import com.kitcenter.runners.homework.hometask6.NumberRunner;
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

            int classNum = 0;

            try {
                classNum = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Incorrect input parameters");
            }

            switch(classNum) {
                case 1:
                    System.out.println("You selected CompareNumbers.");
                    CompareRunner.run();
                    break;
                case 2:
                    System.out.println("You selected NumberEven.");
                    NumberRunner.run();
                    break;
                case 3:
                    System.out.println("You selected Triangle.");
                    TriangleRunner.run();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Incorrect input data");
            }
        }
    }
}
