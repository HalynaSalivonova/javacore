package com.kitcenter.app.homework.lesson11;


import java.util.Arrays;

public class ArrayParser {
    public void arrayParser(double[] data, String direction) {
        Arrays.sort(data);
        if(direction.equals("<")){
            System.out.println(Arrays.toString(data));
        } else if(direction.equals(">")){
            for (int i = data.length - 1, j = 0; i > j; i--, j++){
                double temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
            System.out.println(Arrays.toString(data));
        } else {
            System.out.println("Wrong argument of direction");
        }
    }
}
