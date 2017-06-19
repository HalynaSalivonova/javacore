package com.kitcenter.runners.classwork.lesson15;


import com.kitcenter.app.classwork.lesson15.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop mac = new Laptop();
        mac.setName("Mac");
        mac.setColor("White");
        mac.setCpu(4);
        mac.setRam(16);

        Laptop hp = new Laptop();
        hp.setName("HP");
        hp.setColor("Silver");
        hp.setCpu(4);
        hp.setRam(16);

        System.out.println(mac.equals(hp));

        mac.fix("Mac2");
        mac.fix("Mac2", "Colour2");

//        String s1 = null;
//        String s2 = "KIT";
//        //null safe
//        System.out.println(s2.equals(s1));
//        //NullPointerException
//        System.out.println(s1.equals(s2));
//
////casting to object and vice versa
//        Object macObject = mac;
//        Object hpObject = hp;
//        mac = (Laptop) macObject;
//        hp = (Laptop) hpObject;
    }
}
