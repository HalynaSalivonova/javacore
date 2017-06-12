package com.kitcenter.runners.homework.hometask12;


import java.io.*;

public class AppRunner {
    public static void main(String[] args) { run(); }
    public static void run(){
        try {
            System.out.println("Please input the name of file");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/home/mykhailo/javacore/src/main/resources/" + reader.readLine())));
            System.out.println("Write info into your file. Input *exit* when you finished work with file");
            String next = reader.readLine();
            while (!next.equals("*exit*")){
                writer.write(next);
                writer.newLine();
                next = reader.readLine();
            }
            reader.close();
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
