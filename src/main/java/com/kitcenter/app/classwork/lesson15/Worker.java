package com.kitcenter.app.classwork.lesson15;


public class Worker extends Person{

    public Worker(String name) {
        super(name);
    }

    @Override
    public String getResponse(String question){
        return "What was the question for worker?";
    }
}
