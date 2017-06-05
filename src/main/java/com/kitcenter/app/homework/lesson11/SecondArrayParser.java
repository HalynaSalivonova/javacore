package com.kitcenter.app.homework.lesson11;


import java.util.Arrays;

public class SecondArrayParser {
    public void secondArrayParser(String[] arr){

        String alphabet = "abcdefghjklmnopqrstuvwxyz";
        String result = "";
        String data = Arrays.toString(arr);
        char[] stringToChar = data.toCharArray();
        for (int j = 0; j < stringToChar.length; j++){
            String ch = String.valueOf(stringToChar[j]);
            if(alphabet.contains(ch) || alphabet.toUpperCase().contains(ch)){
                result +=ch;
            }
        }
        System.out.println(result);
    }
}
