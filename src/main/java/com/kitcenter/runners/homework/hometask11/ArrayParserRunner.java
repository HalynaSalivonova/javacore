package com.kitcenter.runners.homework.hometask11;

import com.kitcenter.app.homework.lesson11.ArrayParser;

import java.util.Scanner;

public class ArrayParserRunner {
    public static void main(String[] args) { run(); }
    public static void run(){
        ArrayParser userData = new ArrayParser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers with ; separator");
        String str = scanner.nextLine();
        String[] arr = str.split(";");
        double[] data = new double[arr.length];

        try {
            for (int i = 0; i < arr.length; i++) {
                data[i] = Double.parseDouble(arr[i]);
            }
        } catch (NumberFormatException e){
            System.out.println("Incorrect input parameters");
            return;
        }
        System.out.println("Please put > for descending or < for ascending");
        String direction = scanner.nextLine();
        userData.arrayParser(data, direction);
    }
}

