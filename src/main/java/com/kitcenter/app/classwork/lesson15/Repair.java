package com.kitcenter.app.classwork.lesson15;


public class Repair implements Bicycle, BicycleRepair{
    @Override
    public void changeGear(int value) {
        System.out.println("BMA changing gear: " + value);
    }

    @Override
    public void shift() {
        System.out.println("New shift");
    }

    @Override
    public int changeSpeed(int speed) {
        return speed;
    }
}
