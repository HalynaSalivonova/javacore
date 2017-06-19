package com.kitcenter.runners.classwork.lesson15;


import com.kitcenter.app.classwork.lesson15.*;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bma = new BMA();
        Bicycle acme = new ACME();
        Bicycle bmn = new BMN();
        BicycleRepair repair = new Repair();
        changeGear(repair, 45, 69, 87);
        changeGear(bma, 20, 21, 22);
        changeGear(acme, 30, 31, 32);
        changeGear(bmn, 50, 51, 52);
        shift(bma);
        shift(acme);
        shift(bmn);

    }

    public static void changeGear(Bicycle bicycle, int value, int speed, int repair){
        bicycle.changeGear(value);
        bicycle.changeSpeed(speed);
        bicycle.repairCounter(repair);
    }

    public static void shift(Bicycle bicycle){
        bicycle.shift();
    }
}
