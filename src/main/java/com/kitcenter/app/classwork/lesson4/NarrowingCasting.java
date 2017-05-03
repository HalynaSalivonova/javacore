package com.kitcenter.app.classwork.lesson4;

/**
 * Created by mykhailo on 2017.05.03..
 */
public class NarrowingCasting {
    //int int1 = 0;
    double double1 = 3.14159d;
    float float1 = 0.0f;

    public void narrowing(){
        //int1 = (int) float1;
        float1 = (float) double1;
        System.out.println(float1);
    }
}
