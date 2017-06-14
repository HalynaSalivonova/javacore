package com.kitcenter.app.classwork.lesson15;


public class ACME implements Bicycle{

    @Override
    public void changeGear(int value) {
        System.out.println("Change gear to: " + value);
    }

    @Override
    public void shift() {
        System.out.println("New shift");
    }
}
