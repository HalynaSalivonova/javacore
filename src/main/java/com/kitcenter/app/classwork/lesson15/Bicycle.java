package com.kitcenter.app.classwork.lesson15;

//in interface methods public static by default

public interface Bicycle {
    void changeGear(int value);
    void shift();


//default method we may not override
//we can use default methods for extending different interfaces with the same methods and override it

    default int changeSpeed(int speed){
        System.out.println("Default method, speed is " + speed);
        return speed;
    }

    default int repairCounter(int repair) {
        System.out.println("Default method, the count of repairs " + repair);
        return repair;
    }
}
