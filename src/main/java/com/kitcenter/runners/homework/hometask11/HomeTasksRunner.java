package com.kitcenter.runners.homework.hometask11;


import com.kitcenter.runners.homework.hometask10.PalindromesRunner;
import com.kitcenter.runners.homework.hometask6.CompareRunner;
import com.kitcenter.runners.homework.hometask6.NumberRunner;
import com.kitcenter.runners.homework.hometask6.TriangleRunner;
import com.kitcenter.runners.homework.hometask8.DifferentArraysRunner;
import com.kitcenter.runners.homework.hometask8.NumberSumRunner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeTasksRunner {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("For work with CompareNumbers press 1");
            System.out.println("For work with NumberEven press 2");
            System.out.println("For work with Triangle press 3");
            System.out.println("For work with DifferentArrays press 4");
            System.out.println("For work with NumberSum press 5");
            System.out.println("For work with Palindromes press 6");
            System.out.println("For work with ArrayParser press 7");
            System.out.println("For work with Enigma press 8");
            System.out.println("For work with KeyWord press 9");
            System.out.println("For work with SecondArrayParser press 10");
            System.out.println("For exit press 11");

            int classNum;

            try {
                classNum = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Incorrect input parameters");
                continue;
            }

            switch(classNum) {
                case 1:
                    System.out.println("You selected CompareNumbers");
                    CompareRunner.run();
                    break;
                case 2:
                    System.out.println("You selected NumberEven");
                    NumberRunner.run();
                    break;
                case 3:
                    System.out.println("You selected Triangle");
                    TriangleRunner.run();
                    break;
                case 4:
                    System.out.println("You selected Different arrays");
                    DifferentArraysRunner.run();
                    break;
                case 5:
                    System.out.println("You selected NumberSum");
                    NumberSumRunner.run();
                    break;
                case 6:
                    System.out.println("You selected Palindromes");
                    PalindromesRunner.run();
                    break;
                case 7:
                    System.out.println("You selected ArrayParser");
                    ArrayParserRunner.run();
                    break;
                case 8:
                    System.out.println("You selected Enigma");
                    EnigmaRunner.run();
                    break;
                case 9:
                    System.out.println("You selected KeyWord");
                    KeyWordRunner.run();
                    break;
                case 10:
                    System.out.println("You selected SecondArrayParser");
                    SecondArrayParserRunner.run();
                case 11:
                    return;
                default:
                    System.out.println("Incorrect input data");
            }
        }
    }
}
