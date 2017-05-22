package com.kitcenter.runners.classwork.lesson5;

import com.kitcenter.app.classwork.lesson5.CircleArea;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleRunner {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        try {

            double radius1 = scanner.nextDouble();
            double radius2 = scanner.nextDouble();

            CircleArea circleArea = new CircleArea();

            double circleArea1 = circleArea.getArea(radius1);
            double circleArea2 = circleArea.getArea(radius2);

            Boolean result = CircleArea.calculate(circleArea1, circleArea2);

            if (result == null) {
                System.out.println("CircleArea1: " + circleArea1 + " and CircleArea2: " + circleArea2 + " are equals");
            } else if (result) {
                System.out.println("CircleArea1: " + circleArea1 + " is bigger than CircleArea2: " + circleArea2);
            } else {
                System.out.println("CircleArea2: " + circleArea2 + " is bigger than CircleArea1: " + circleArea1);
            }
        } catch(InputMismatchException exception){
            System.out.println("Incorrect input parameters. Please enter double");
        } catch(IllegalArgumentException exception){
            System.out.println("Incorrect input parameters. " + exception.getMessage());
        }
    }
}