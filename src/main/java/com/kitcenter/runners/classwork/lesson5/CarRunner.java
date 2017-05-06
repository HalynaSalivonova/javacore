package com.kitcenter.runners.classwork.lesson5;


import com.kitcenter.app.classwork.lesson5.Car;

public class CarRunner {
    static int counter = 10;

    public static void main(String[] args) {
        Car car = new Car();
        car.name = "BMW";
        System.out.println(car.name);

        Car car2 = new Car();
        car2.name = "Audi";
        System.out.println(car2.name);

        System.out.println(Car.speed);
        Car.speed = 15;
        Car.showSpeed();

        System.out.println(counter);
    }
}
