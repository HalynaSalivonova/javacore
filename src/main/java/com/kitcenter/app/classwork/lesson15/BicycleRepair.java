package com.kitcenter.app.classwork.lesson15;


public interface BicycleRepair extends Bicycle{

    @Override
    default int changeSpeed(int speed){
        System.out.println("Default method in BicycleRepair " + speed);
        return speed;
    }
}
