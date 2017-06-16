package com.kitcenter.app.homework.lesson15;


public class CustomBicycle extends Bicycle{
    private int speed;
    private int gear;

    public CustomBicycle(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
        System.out.println("Default speed " + speed);
        System.out.println("Default gear " + gear);
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Speed is " + speed);
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("Gear is " + gear);
    }

    @Override
    public void ride() {
        System.out.println("Wshhhh!");
    }
}
