package com.kitcenter.runners.classwork.lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReaderRunner {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/mykhailo/javacore/src/main/resources/Input"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }
    }
}
