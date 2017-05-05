package com.kitcenter.app.utils.convertors;


public class PrimitiveConvertor {

    public char floatToChar(float inputData){
        char outputData = (char) inputData;
        System.out.println("Input float value is " + inputData + ". Output char value is " + outputData);
        return outputData;
    }

    public char intToChar(int inputData){
        char outputData = (char) inputData;
        System.out.println("Input int value is " + inputData + ". Output char value is " + outputData);
        return outputData;
    }

    public int charToInt(char inputData){
        int outputData = (int) inputData;
        System.out.println("Input char value is " + inputData + ". Output int value is " + outputData);
        return outputData;
    }
}
