package com.kitcenter.runners.homework.hometask13;

import com.kitcenter.app.homework.lesson13.Human;
import com.kitcenter.app.homework.lesson13.WhiteCollar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanRunner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please set age");
        String age = reader.readLine();
        System.out.println("Please set name");
        String name = reader.readLine();
        System.out.println("Please set company name");
        String company = reader.readLine();

        Human human = new Human(Integer.parseInt(age), name);
        WhiteCollar whiteCollar = new WhiteCollar(Integer.parseInt(age), name, company);

        System.out.println(human.getAge());
        System.out.println(human.getName());
        System.out.println(whiteCollar.getCompany());
    }
}