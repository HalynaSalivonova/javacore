package com.kitcenter.app.homework.lesson11;


public class Enigma {
    public static String stringEncode(String stringToEncode){
        stringToEncode = stringToEncode.toUpperCase();
        String plainText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cypherText = "987654321!@#$%~&*()_-+=^{}";
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

    public static String stringDecode(String stringToDecode){
        stringToDecode = stringToDecode.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder(stringToDecode);
        String plainText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cypherText = "987654321!@#$%~&*()_-+=^{}";

        for(int i = 0; i < stringBuilder.length(); i++)
            for(int j = 0; j < cypherText.length(); j++){
                if(stringBuilder.charAt(i) == cypherText.charAt(j)){
                    stringBuilder.setCharAt(i, plainText.charAt(j));
                    break;
                }
            }
        return stringBuilder.toString();
    }

    public static String stringChipher(String stringToChiper, int key) {
        byte[] stringToByte = stringToChiper.getBytes();
        char[] byteToChar = new char[stringToByte.length];
        for(int i = 0; i < stringToByte.length; i ++){
            byteToChar[i] = (char) (stringToByte[i] + key);
        }
        String result = String.valueOf(byteToChar);
        return result;
    }

    public static String stringDeChipher(String stringToDeChiper, int key) {
        byte[] stringToByte = stringToDeChiper.getBytes();
        char[] byteToChar = new char[stringToByte.length];
        for(int i = 0; i < stringToByte.length; i ++){
            byteToChar[i] = (char) (stringToByte[i] - key);
        }
        String result = String.valueOf(byteToChar);
        return result;
    }

}
