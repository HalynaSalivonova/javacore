package com.kitcenter.runners.homework.lesson8;

import java.util.Random;
import static java.lang.Integer.*;

public class DifferentArrays {
    public void evenArray() {
        int[] intArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        String str1 = "";
        String str2 = "";
        for (int arrElement : intArray) {
            str1 = str1 + arrElement + " ";
            str2 = str2 + arrElement + "\n";
        }

        System.out.println(str1);
        System.out.println(str2);
    }

        public void oddArray() {
            int[] mas = new int[50];
            for (int i = 0, n = 1; i < mas.length; n = n + 2, i++) {
                mas[i] = n;
                System.out.print(mas[i] + " ");
            }

            System.out.println();

            for (int i = mas.length - 1; i >= 0; i--) {
                System.out.print(mas[i] + " ");
            }
            System.out.println("\n");
        }

        public void randomArray() {
            int[] mas = new int[15];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = (int) (Math.random() * 9);
                System.out.print(mas[i] + " ");
            }
            System.out.println();
            int j = 0;
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] % 2 == 0) {
                    j++;
                }
            }
            System.out.print("Array has: " + j + " even numbers");
            System.out.println("\n");
        }

        public void bigRandomArray() {
            int[] mas = new int[15];
            int min = MAX_VALUE;
            int max = MIN_VALUE;
            for (int i = 0; i < mas.length; i++) {
                mas[i] = (int) (Math.random() * 999);
                min = min(min, mas[i]);
                max = max(max, mas[i]);

                System.out.print(mas[i] + " ");
            }
            System.out.println();
            System.out.println("Max number in array: " + max);
            System.out.println("Min number in array: " + min);
            System.out.println("\n");
        }

        public void twoDimensionArrays() {
            int m = 8, n = 5;
            int mas[][] = new int[m][n];

            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++) {
                    mas[i][j] = 10 + (int) (Math.random() * (99 - 10));
                }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(mas[i][j] + " ");
                System.out.println();
            }
            System.out.println("\n");
        }

        public void twoDimensionArraysStars() {
            int m = 8, n = 5;
            int mas[][] = new int[m][n];

            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++) {
                    mas[i][j] = 1 + (int) (Math.random() * (999 - 1));
                }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(mas[i][j] + "\t\t");
                System.out.println();
            }
        }
    }


