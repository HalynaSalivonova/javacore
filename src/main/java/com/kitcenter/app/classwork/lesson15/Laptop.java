package com.kitcenter.app.classwork.lesson15;


import java.util.Objects;

public class Laptop {
    private String name;
    private String color;
    private int cpu;
    private int ram;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void fix(String name){
        System.out.println("Fix1");
    }

    public void fix(String name, String color){
        System.out.println("Fix2");
    }



//better practise
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;

        Laptop laptop = (Laptop) o;

        if (getCpu() != laptop.getCpu()) return false;
        return getRam() == laptop.getRam();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpu(), getRam());
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Laptop)) return false;
//
//        Laptop laptop = (Laptop) o;
//
//        if (cpu != laptop.cpu) return false;
//        return ram == laptop.ram;
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = cpu;
//        result = 31 * result + ram;
//        return result;
//    }
}
