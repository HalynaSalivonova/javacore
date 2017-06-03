package com.kitcenter.app.classwork.lesson10;


import java.util.Arrays;

public class StringConvertor {
    public static void main(String[] args) {
        String stringToDisplay = "";
        char[] charArrayToString = {'a', 'b', 'c'};
        for(int i = 0; i < charArrayToString.length; i++){
            stringToDisplay += charArrayToString[i];
        }
        System.out.println(stringToDisplay);

        stringToDisplay = Arrays.toString(charArrayToString);
        stringToDisplay.replace(",", " ");
        stringToDisplay.replace("[", " ");
        stringToDisplay.replace("]", " ");
        stringToDisplay.trim();
        System.out.println(stringToDisplay);

        String toFloat = "0.44";
        float fin = Float.valueOf(toFloat);
        System.out.println(fin);

        String reverseFin = String.valueOf(fin);
        System.out.println(reverseFin);

        String toInt = "100";
        int i = Integer.valueOf(toInt);
        System.out.println(i);

        String reverseI = String.valueOf(i);
        System.out.println(reverseI);
    }
}
