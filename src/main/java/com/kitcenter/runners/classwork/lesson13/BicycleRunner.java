package com.kitcenter.runners.classwork.lesson13;


import com.kitcenter.app.classwork.lesson13.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();//Type name = new object(call method); - constructor
        System.out.println(bicycle.color);

        String name = "KOMANCHE";
        Bicycle bicycle1 = new Bicycle();
        System.out.println(bicycle1.getName());
        bicycle1.setName("KOMANCHE-PRO");
 //       bicycle1.name = "KOMANCHE-PRO"; private
        System.out.println(bicycle1.getSpeed());
        bicycle1.setSpeed(800);
        System.out.println(bicycle1.getSpeed());


        String color = "Red";
        int wheelSize = 10;
        Bicycle bicycle2 = new Bicycle(name, wheelSize);
        System.out.println(bicycle2.getName() + " " + bicycle2.wheelSize);
    }
}
