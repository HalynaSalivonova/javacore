package com.kitcenter.runners.classwork.lesson6;

import com.kitcenter.app.classwork.lesson6.Loop;

import java.util.Scanner;

public class LoopRunner {
    public static void main(String[] args) {
        System.out.println("Input two numbers: ");
        Scanner scanner = new Scanner(System.in);
        double numberOne = scanner.nextDouble();
        double numberTwo = scanner.nextDouble();

        Loop loop = new Loop();
        loop.condition(numberOne, numberTwo);
        loop.printByCycle(10);
        loop.printInfo(1);
        loop.counterOdd(20);
    }
}