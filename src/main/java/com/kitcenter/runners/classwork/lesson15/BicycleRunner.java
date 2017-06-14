package com.kitcenter.runners.classwork.lesson15;


import com.kitcenter.app.classwork.lesson15.BMN;
import com.kitcenter.app.classwork.lesson15.Bicycle;
import com.kitcenter.app.classwork.lesson15.ACME;
import com.kitcenter.app.classwork.lesson15.BMA;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bma = new BMA();
        Bicycle acme = new ACME();
        Bicycle bmn = new BMN();
        changeGear(bma, 20);
        changeGear(acme, 30);
        changeGear(bmn, 50);
        shift(bma);
        shift(acme);
        shift(bmn);

    }

    public static void changeGear(Bicycle bicycle, int value){
        bicycle.changeGear(value);
    }

    public static void shift(Bicycle bicycle){
        bicycle.shift();
    }
}
