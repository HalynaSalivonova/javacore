package com.kitcenter.runners.classwork.lesson9;


public class DebugRunner {
    public static void main(String[] args) {
        int[] ints = new int[10];
        for(int i = 0; i < ints.length; i++){
            ints[i] = i * 2;
        }

        int a = 5;
        int b = 6;
        if(a > b){
            System.out.println();
        }
    }
}
