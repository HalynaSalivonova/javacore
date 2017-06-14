package com.kitcenter.app.classwork.lesson15;


public class Student extends Person{
    private String university;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    @Override
    public String getResponse(String question){
        return "Ehhh, what was the question?";
    }

    //toString for info logging
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
