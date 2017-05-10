package com.kitcenter.app.classwork.lesson5;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CalculatorTest {

    /*
    Initialize test data fot Calculator functionality
     */

    @BeforeClass
    public static void setBeforeClassSetUp() {

    }

    @Ignore("Not ready yet Bug#1") //when you need to ignore some test
    @Test
    public void sumTest1(){
        double expectedResult = 50;
        Calculator calculator = new Calculator();
        double actualResult = calculator.sum(40, 10);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void sumTest2(){
        double expectedResult = 0;
        Calculator calculator = new Calculator();
        double actualResult = calculator.sum(-5, 5);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void sumTest3(){
        double expectedResult = -15;
        Calculator calculator = new Calculator();
        double actualResult = calculator.sum(-6, -9);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void sumTest4(){
        double expectedResult = 9.9446687E7;
        Calculator calculator = new Calculator();
        double actualResult = calculator.sum(456789, 98989898);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void sumTest5(){
        double expectedResult = 10.78925;
        Calculator calculator = new Calculator();
        double actualResult = calculator.sum(0.00025, 10.789);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void substractTest1(){
        double expectedResult = 489;
        Calculator calculator = new Calculator();
        double actualResult = calculator.substract(501, 12);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void substractTest2(){
        double expectedResult = 174;
        Calculator calculator = new Calculator();
        double actualResult = calculator.substract(89, -85);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void substractTest3(){
        double expectedResult = 5;
        Calculator calculator = new Calculator();
        double actualResult = calculator.substract(-5, -10);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void substractTest4(){
        double expectedResult = 104317227;
        Calculator calculator = new Calculator();
        double actualResult = calculator.substract(105105105, 787878);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void substractTest5(){
        double expectedResult = 0;
        Calculator calculator = new Calculator();
        double actualResult = calculator.substract(789, 789);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void substractTest6(){
        double expectedResult = 0.25;
        Calculator calculator = new Calculator();
        double actualResult = calculator.substract(0.5, 0.25);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void multiplicationTest1(){
        double expectedResult = 360;
        Calculator calculator = new Calculator();
        double actualResult = calculator.multiplication(45, 8);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void multiplicationTest2(){
        double expectedResult = 480;
        Calculator calculator = new Calculator();
        double actualResult = calculator.multiplication(4.8, 100);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void multiplicationTest3(){
        double expectedResult = -4984;
        Calculator calculator = new Calculator();
        double actualResult = calculator.multiplication(-89, 56);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void multiplicationTest4(){
        double expectedResult = 184;
        Calculator calculator = new Calculator();
        double actualResult = calculator.multiplication(-8, -23);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void multiplicationTest5(){
        double expectedResult = 0;
        Calculator calculator = new Calculator();
        double actualResult = calculator.multiplication(587, 0);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void multiplicationTest6(){
        double expectedResult = 9.71470439424E11;
        Calculator calculator = new Calculator();
        double actualResult = calculator.multiplication(985632, 985632);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public  void divicionTest1(){
        double expectedResult = 189;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(378, 2);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public  void divicionTest2(){
        double expectedResult = 2;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(5, 2.5);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public  void divicionTest3(){
        double expectedResult = -49;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(98, -2);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public  void divicionTest4(){
        double expectedResult = 3.75;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(-105, -28);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public  void divicionTest5(){
        double expectedResult = 1.628162815E8;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(325632563, 2);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public  void divicionTestNegative6(){
        double expectedResult = 0;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divicion(985, 0);
        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @After
    public void tearDown(){
        System.out.println("Postcondition for every test");
    }

    @AfterClass
    public static void tearDownForClass(){
        System.out.println("Postcondition for class test");
    }
}
