package com.kitcenter.runners.homework.hometask15;


import com.kitcenter.app.homework.lesson15.Clove;
import com.kitcenter.app.homework.lesson15.Flower;
import com.kitcenter.app.homework.lesson15.Rose;
import com.kitcenter.app.homework.lesson15.Tulip;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower rose = new Rose(50, 3);
        Flower tulip = new Tulip(20, 10);
        Flower clove = new Clove(5, 15);

        double price = getCompositionPrice(rose, tulip, clove);
        System.out.println("Your flower composition cost " + price);
    }
//create array ... flowers

    public static double getCompositionPrice(Flower ... flowers){
        double price = 0;
        for(int i = 0; i < flowers.length; i++){
            price += flowers[i].getPrice();
        }
        return price;
    }
}
