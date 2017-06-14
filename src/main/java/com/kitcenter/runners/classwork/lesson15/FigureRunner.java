package com.kitcenter.runners.classwork.lesson15;


import com.kitcenter.app.classwork.lesson15.Circle;
import com.kitcenter.app.classwork.lesson15.Figure;
import com.kitcenter.app.classwork.lesson15.Rectangle;
import com.kitcenter.app.classwork.lesson15.Square;

public class FigureRunner {
    public static void main(String[] args) {
        Figure circle = new Circle(10);
        Figure rectangle = new Rectangle(10, 10);
        Figure square = new Square(10, 10);

        double circlePerimeter = getPerimeter(circle);
        double rectanglePerimeter = getPerimeter(rectangle);
        double squarePerimeter = getPerimeter(square);

        System.out.println(circlePerimeter);
        System.out.println(rectanglePerimeter);
        System.out.println(squarePerimeter);

    }
    public static double getPerimeter(Figure figure){
        return figure.getPerimeter();
    }
}

