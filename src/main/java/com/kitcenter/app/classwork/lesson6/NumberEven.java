package com.kitcenter.app.classwork.lesson6;

import java.util.Scanner;

public class NumberEven {
    public  static void calculate() {
        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();
        if((int1%2)==0) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is odd");
        }
    }
}
