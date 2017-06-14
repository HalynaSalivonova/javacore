package com.kitcenter.app.classwork.lesson15;


public class Circle extends Figure{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.pow(radius, 2);
    }
}
