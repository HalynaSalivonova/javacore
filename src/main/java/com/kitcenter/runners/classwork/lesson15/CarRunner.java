package com.kitcenter.runners.classwork.lesson15;


import com.kitcenter.app.classwork.lesson15.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car BMW = new Car();
        BMW.setName("BMW");
        BMW.setSpeed(250);

        Car Audi = new Car();
        Audi.setName("Audi");
        Audi.setSpeed(250);

        System.out.println(BMW.equals(Audi));
    }
}
