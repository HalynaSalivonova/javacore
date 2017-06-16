package com.kitcenter.app.homework.lesson13;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name){
        setAge(age);
        setName(name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > 0 && age <= 120) {
            this.age = age;
            System.out.println("New age setted");
        } else {
            System.out.println("Age invalid");
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
