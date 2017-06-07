package com.kitcenter.app.classwork.lesson13;


public class Bicycle {
//    public Bicycle(){} ---> invisible default constructor for class exemplar creation
    public int wheelSize;
    public String color;
    private String name = "KOMANCHE 2";
    private int speed = 500;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bicycle(int wheelSize, String name){
        System.out.println("Override default constructor");
    }

    public Bicycle(){
        this.name = name;
    }

    public Bicycle(String name, int wheelSize){
        this.name = name;
        this.wheelSize = wheelSize;
        this.printMe();
    }

    public Bicycle(int wheelSize, String color, String name) {
        this(wheelSize, name);
        this.color = color;
        this.name = name;
    }

    public void printMe(){
        System.out.println("Print " + showNameAndColor());
    }

    private String showNameAndColor(){
        return name + " " + color;
    }
}
