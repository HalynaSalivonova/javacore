package com.kitcenter.runners.homework.hometask12;


import com.kitcenter.app.homework.lesson12.IntArray;

import java.io.*;
import java.util.Arrays;

public class IntArrayRunner {
    public static void main(String[] args) { run(); }
    public static void run(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/mykhailo/javacore/src/main/resources/ArrayDataRead"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/mykhailo/javacore/src/main/resources/ArrayDataWrite"));
            String line;
            double[] data;
            while ((line = reader.readLine()) != null){
                String[] arr = line.split(",");
                data = new double[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    data[i] = Double.parseDouble(arr[i]);
                }
                IntArray intArray = new IntArray();
                intArray.userData(data);

                writer.write(Arrays.toString(data));
                writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
