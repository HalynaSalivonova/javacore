package com.kitcenter.app.homework.lesson6;


import com.kitcenter.app.classwork.lesson6.CompareNumbers;
import com.kitcenter.app.classwork.lesson6.NumberEven;
import com.kitcenter.app.classwork.lesson6.Triangle;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.DEFAULT)

public class Lesson6Test {
    @BeforeClass
    public static void setBeforeClassSetUp() {

    }

    @Test
    public void isBigger1(){
        CompareNumbers compareNumbers = new CompareNumbers();
        Boolean actualResult = compareNumbers.isBigger(9, 5);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void isBigger2(){
        CompareNumbers compareNumbers = new CompareNumbers();
        Boolean actualResult = compareNumbers.isBigger(1, 50);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void isBigger3(){
        CompareNumbers compareNumbers = new CompareNumbers();
        Boolean actualResult = compareNumbers.isBigger(80, 80);
        Assert.assertNull(actualResult);
    }

    @Test
    public void isBigger4(){
        CompareNumbers compareNumbers = new CompareNumbers();
        Boolean actualResult = compareNumbers.isBigger(-89, 0.25);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void isBigger5(){
        CompareNumbers compareNumbers = new CompareNumbers();
        Boolean actualResult = compareNumbers.isBigger(2.3E5, 4.25);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void isBigger6(){
        CompareNumbers compareNumbers = new CompareNumbers();
        Boolean actualResult = compareNumbers.isBigger(-8963, 0);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void isEven1(){
        NumberEven numberEven = new NumberEven();
        Boolean actualResult = numberEven.isEven(8);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void isEven2(){
        NumberEven numberEven = new NumberEven();
        Boolean actualResult = numberEven.isEven(3);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void isEven3(){
        NumberEven numberEven = new NumberEven();
        Boolean actualResult = numberEven.isEven(0);
        Assert.assertNull(actualResult);
    }

    @Test
    public void isEven4(){
        NumberEven numberEven = new NumberEven();
        Boolean actualResult = numberEven.isEven(-7898);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void isEven5(){
        NumberEven numberEven = new NumberEven();
        Boolean actualResult = numberEven.isEven(69.789);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void isRightTriangle1(){
        Triangle triangle = new Triangle();
        Boolean actualResult = triangle.isRightTriangles(3, 4, 5);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void isRightTriangle2(){
        Triangle triangle = new Triangle();
        Boolean actualResult = triangle.isRightTriangles(4, 3, 5);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void isRightTriangle3(){
        Triangle triangle = new Triangle();
        Boolean actualResult = triangle.isRightTriangles(5, 4, 3);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void isRightTriangle4(){
        Triangle triangle = new Triangle();
        Boolean actualResult = triangle.isRightTriangles(0, 8, 3);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void isRightTriangle5(){
        Triangle triangle = new Triangle();
        Boolean actualResult = triangle.isRightTriangles(8, 7, -6);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void isRightTriangle6(){
        Triangle triangle = new Triangle();
        Boolean actualResult = triangle.isRightTriangles(4, 6, 8);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void isRightTriangle7(){
        Triangle triangle = new Triangle();
        Boolean actualResult = triangle.isRightTriangles(4.86, 6, 8);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void isRightTriangle8(){
        Triangle triangle = new Triangle();
        Boolean actualResult = triangle.isRightTriangles(3.3, 4.4, 5.5);
        Assert.assertTrue(actualResult);
    }
}
