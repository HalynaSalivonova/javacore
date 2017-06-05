package com.kitcenter.runners.homework.hometask8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSumRunner {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the numbers");
        System.out.println("For exit enter: \"Exit\"");

        try {
            int sum = 0;
            String txt;
            while (true) {
                txt = reader.readLine();
                if (!txt.equals("exit") && !txt.equals("Exit")) {
                    int a = Integer.parseInt(txt);
                    sum += a;
                } else break;
            }
            System.out.println("The sum of entered numbers is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input parameters");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
