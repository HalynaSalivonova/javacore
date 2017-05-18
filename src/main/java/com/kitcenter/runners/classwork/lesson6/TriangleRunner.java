package com.kitcenter.runners.classwork.lesson6;

import com.kitcenter.app.classwork.lesson6.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TriangleRunner {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        try {
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();


            boolean result = Triangle.isRightTriangles(a, b, c);
            if (result) {
                System.out.println("The Triangle is right");
            } else {
                System.out.println("The Triangle doesn't right");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Incorrect input parameters. Please enter double");
        }
    }
}