package com.kitcenter.app.utils.runners;


import com.kitcenter.app.utils.convertors.PrimitiveConvertor;

public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        float float1 = 6.456f;
        char char1 = 'B';
        int int1 = 457;

        primitiveConvertor.floatToChar(float1);
        primitiveConvertor.charToInt(char1);
        primitiveConvertor.intToChar(int1);
    }
}
