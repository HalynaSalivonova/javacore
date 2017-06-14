package com.kitcenter.runners.classwork.lesson15;


import com.kitcenter.app.classwork.lesson15.Person;
import com.kitcenter.app.classwork.lesson15.Student;
import com.kitcenter.app.classwork.lesson15.Teacher;
import com.kitcenter.app.classwork.lesson15.Worker;

public class PersonRunner {
    public static void main(String[] args) {
//        Student student = new Student("Halyna", "Life");
//        System.out.println(student.getResponse("What is the class?"));
//        Teacher teacher = new Teacher("Sergii", "KIT");
//        System.out.println(teacher.getResponse("What time is now?"));
// INTERFACE:

        Person student = new Student("Halyna", "Luxoft");
        showResponse(student, "What is the class?");
        System.out.println(student);

        Person teacher = new Teacher("Sergii", "KIT");
        showResponse(teacher, "What time is now?");

        Person worker = new Worker("Egor");
        showResponse(worker, "Worker response");

    }

    public static void showResponse(Person person, String question){
        System.out.println(person.getResponse(question));
    }
}
