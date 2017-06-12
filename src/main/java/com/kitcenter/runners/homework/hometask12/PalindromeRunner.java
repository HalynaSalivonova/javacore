package com.kitcenter.runners.homework.hometask12;


import com.kitcenter.app.homework.lesson12.Palindrome;

import java.io.*;

public class PalindromeRunner {
    public static void main(String[] args) { run(); }
    public static void run(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/mykhailo/javacore/src/main/resources/PalindromeRead"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/mykhailo/javacore/src/main/resources/PalindromeWrite"));
            String line;
            while ((line = reader.readLine()) != null){
                Palindrome palindrome = new Palindrome();
                String answer = palindrome.palindromeMethod(line);
                writer.write(line + answer);
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
