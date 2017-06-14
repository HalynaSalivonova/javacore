package com.kitcenter.app.classwork.lesson15;


public class BMA implements Bicycle{

    @Override
    public void shift(){
        System.out.println("New shift");
    }

    @Override
    public void changeGear(int value) {
        System.out.println("BMA changing gear: " + value);
    }
}
