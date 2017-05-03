package com.kitcenter.app.classwork.lesson5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mykhailo on 2017.05.03..
 */
public class CalculatorTest {
    @Test
    public void sumTest(){
        int numberOne = 10;
        int numberTwo = 40;
        int expectedResult = 50;

        Calculator calculator = new Calculator();
        int actualResult = calculator.sum( numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void substractTest(){
        int numberOne = 40;
        int numberTwo = 10;
        int expectedResult = 30;

        Calculator calculator = new Calculator();
        int actualResult = calculator.substract( numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
