package com.kitcenter.app.classwork.lesson6;


public class Loop {
    public void condition(double numberOne, double numberTwo){
        if(numberOne > numberTwo) {
            while (numberOne > numberTwo) {
                numberOne--;
                System.out.println("First number: " + numberOne + " Second number: " + numberTwo);
            }
        } else if(numberOne <= numberTwo){
            System.out.println("First number: " + numberOne + " Second number: " + numberTwo);
        }
    }

    public void printByCycle(int limit){
        for(int i = 0; i <= limit; i++){
            System.out.println("i = " + i);
        }
    }

    public void printInfo(int c){
        System.out.println("Original a value " + c);
        System.out.println("Post-increment a " + c++);
        System.out.println("After post-increment " + c);
        System.out.println("Pre-increment a " + ++c);
        System.out.println("After pre-increment " + c);
    }

    public int counterOdd(int limit){
        int counter = 0;
        for (int i = 0; i <= limit; i++) {
            if(i%2 != 0) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
}
