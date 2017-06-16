package com.kitcenter.runners.homework.hometask15;


import com.kitcenter.app.homework.lesson15.Bicycle;
import com.kitcenter.app.homework.lesson15.BicycleWithRing;
import com.kitcenter.app.homework.lesson15.BicycleWithRingInterface;
import com.kitcenter.app.homework.lesson15.CustomBicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle customBicycle = new CustomBicycle(0, 0);
        BicycleWithRingInterface bicycleWithRing = new BicycleWithRing(305, 89);
        customBicycle.setSpeed(30);
        customBicycle.setGear(80);
        bicycleWithRing.ring();
        customBicycle.ride();
    }
}