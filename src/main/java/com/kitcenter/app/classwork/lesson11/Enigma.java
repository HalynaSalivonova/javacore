package com.kitcenter.app.classwork.lesson11;


public class Enigma {
    public static String stringEncode(String stringToEncode){
        String plainText = "ABC456";
        String cypherText = "123DEF";
        StringBuilder stringBuilder = new StringBuilder(stringToEncode);

        for(int i = 0; i < stringBuilder.length(); i++)
            for(int j = 0; j < plainText.length(); j++){
                if(stringBuilder.charAt(i) == plainText.charAt(j)){
                    stringBuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }
            }
        return stringBuilder.toString();
    }
}
