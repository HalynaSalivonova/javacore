package com.kitcenter.runners.classwork.lesson17;


import com.kitcenter.app.classwork.lesson17.Season;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SeasonRunner {
    public static void main(String[] args) throws IOException {
        Season season = Season.SPRING;

//compare the same link == to object
        if(season == Season.SPRING){
            season = Season.SUMMER;
        }

        System.out.println(season.name());
        System.out.println(season.AUTUMN.name());

        Season season1 = Season.valueOf("SPRING");
        System.out.println(season1.name());

        Season[] values = Season.values();
        System.out.println(Arrays.toString(values));

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter the name of season");
            String time = reader.readLine();
            Season season2 = Season.valueOf (time);
            switch (time) {
                case "SPRING":
                    System.out.println(season2.toString());
                    break;
                case "SUMMER":
                    System.out.println(season2.toString());
                    break;
                case "AUTUMN":
                    System.out.println(season2.toString());
                    break;
                case "WINTER":
                    System.out.println(season2.toString());
                    break;
                }
            } catch (IllegalArgumentException e) {
            System.out.println("Invalid season selection!");
        }
    }
}
