package com.kitcenter.app.classwork.lesson6;

import java.util.Scanner;

public class NumberEven {
    public  static Boolean isEven(double a) {
        Boolean result = (a == 0);
        if(result){
            return null;
        } else {
            return (a%2)==0;
        }
    }
}
