package com.kitcenter.app.homework.lesson6;

import com.kitcenter.app.classwork.lesson6.CompareNumbers;
import com.kitcenter.app.classwork.lesson6.NumberEven;
import com.kitcenter.app.classwork.lesson6.Triangle;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class DataDrivenTests {
    @Test
    @FileParameters(value = "src/test/resources/testdataCompareNumbers.csv",
            mapper = CsvWithHeaderMapper.class)
    public void isBigger(double argA, double argB, Boolean expOut){
        CompareNumbers compareNumbers = new CompareNumbers();
        Assert.assertEquals(expOut, compareNumbers.isBigger(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/testdataNumberEven.csv",
            mapper = CsvWithHeaderMapper.class)
    public void isEven(double argA, Boolean expOut){
        NumberEven numberEven = new NumberEven();
        Assert.assertEquals(expOut, numberEven.isEven(argA));
    }

    @Test
    @FileParameters(value = "src/test/resources/testdataTriangle.csv",
            mapper = CsvWithHeaderMapper.class)
    public void isRightTriangle(double argA, double argB, double argC, Boolean expOut){
        Triangle triangle = new Triangle();
        Assert.assertEquals(expOut, triangle.isRightTriangles(argA, argB, argC));
    }
}


