package com.kitcenter.app.homework.lesson15;


public abstract class Bicycle {
    public abstract void setSpeed(int speed);
    public abstract void setGear(int gear);

    public void ride(){
        System.out.println("Wroom!");
    }
}
