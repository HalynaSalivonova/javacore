package com.kitcenter.runners.homework.hometask11;

import com.kitcenter.app.homework.lesson11.SecondArrayParser;

import java.util.Scanner;

public class SecondArrayParserRunner {
    public static void main(String[] args) { run();}
    public static void run(){
        SecondArrayParser userData = new SecondArrayParser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select and enter any separator. Use any symbols except . and , or use ;");
        String separator = scanner.nextLine();
        if(separator.equals(".") || separator.equals(",")){
            System.out.println("Incorrect separator");
            return;
        }
        System.out.println(("Please enter info divided it by selected separator"));
        String str = scanner.nextLine();
        String[] arr = str.split(separator);
        userData.secondArrayParser(arr);
    }
}