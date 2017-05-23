package com.kitcenter.app.homework.lesson7;

import com.kitcenter.app.classwork.lesson5.Calculator;
import com.kitcenter.app.classwork.lesson5.CircleArea;
import com.kitcenter.app.classwork.lesson6.CompareNumbers;
import com.kitcenter.app.classwork.lesson6.Loop;
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
        Assert.assertEquals(expOut, CompareNumbers.isBigger(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/testdataNumberEven.csv",
            mapper = CsvWithHeaderMapper.class)
    public void isEven(double argA, Boolean expOut){
        Assert.assertEquals(expOut, NumberEven.isEven(argA));
    }

    @Test
    @FileParameters(value = "src/test/resources/testdataTriangle.csv",
            mapper = CsvWithHeaderMapper.class)
    public void isRightTriangle(double argA, double argB, double argC, Boolean expOut){
        Assert.assertEquals(expOut, Triangle.isRightTriangles(argA, argB, argC));
    }

    @Test
    @FileParameters(value = "src/test/resources/testdataCalculatorSum.csv",
            mapper = CsvWithHeaderMapper.class)
    public void sum(double argA, double argB, double expOut){
        double delta;
        Assert.assertEquals(expOut, Calculator.sum(argA, argB), delta = 0.0);
    }

    @Test
    @FileParameters(value = "src/test/resources/testdataCalculatorSubstract.csv",
            mapper = CsvWithHeaderMapper.class)
    public void substract(double argA, double argB, double expOut){
        Calculator calculator = new Calculator();
        double delta;
        Assert.assertEquals(expOut, calculator.substract(argA, argB), delta = 0.0);
    }

    @Test
    @FileParameters(value = "src/test/resources/testdataCalculatorMultiplication.csv",
            mapper = CsvWithHeaderMapper.class)
    public void multiplication(double argA, double argB, double expOut){
        Calculator calculator = new Calculator();
        double delta;
        Assert.assertEquals(expOut, calculator.multiplication(argA, argB), delta = 0.0);
    }

    @Test
    @FileParameters(value = "src/test/resources/testdataCalculatorDivicion.csv",
            mapper = CsvWithHeaderMapper.class)
    public void divicion(double argA, double argB, double expOut){
        Calculator calculator = new Calculator();
        double delta;
        Assert.assertEquals(expOut, calculator.divicion(argA, argB), delta = 0.0);
    }

    @Test
    @FileParameters(value = "src/test/resources/testdataCircleArea.csv",
            mapper = CsvWithHeaderMapper.class)
    public void calculate(double argA, double argB, Boolean expOut){
        CircleArea circleArea = new CircleArea();
        Assert.assertEquals(expOut, circleArea.calculate(argA,argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/testdataLoop.csv",
            mapper = CsvWithHeaderMapper.class)
    public void loop(double argA, double expOut){
        Loop loop = new Loop();
        double delta;
        Assert.assertEquals(expOut, loop.counterOdd(argA), delta = 0.0);
    }
}


