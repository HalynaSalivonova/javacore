package com.kitcenter.runners.homework.hometask8;

import com.kitcenter.app.homework.lesson8.DifferentArrays;

public class DifferentArraysRunner {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        DifferentArrays differentArrays = new DifferentArrays();
        differentArrays.evenArray();
        differentArrays.oddArray();
        differentArrays.randomArray();
        differentArrays.bigRandomArray();
        differentArrays.twoDimensionArrays();
        differentArrays.twoDimensionArraysStars();
    }
}

