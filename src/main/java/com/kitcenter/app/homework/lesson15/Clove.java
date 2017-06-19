package com.kitcenter.app.homework.lesson15;


public class Clove extends Flower{
    private double price;
    private int count;

    public Clove(double price, int count) {
        this.price = price;
        this.count = count;
    }

    @Override
    public double getPrice() {
        return price * count;
    }
}
