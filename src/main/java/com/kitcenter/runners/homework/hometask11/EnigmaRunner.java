package com.kitcenter.runners.homework.hometask11;

import com.kitcenter.app.homework.lesson11.Enigma;

import java.util.Scanner;

public class EnigmaRunner {
    public static void main(String[] args) { run();}
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter plain text");
        String text = scanner.nextLine();
        String encodedText = Enigma.stringEncode(text);
        System.out.println("Your encoded text: ");
        System.out.println(encodedText);

        String decodedText = Enigma.stringDecode(encodedText);
        System.out.println("Your decoded text: ");
        System.out.println(decodedText);

        System.out.println("\n");

        System.out.println("Another chipher algorithm");
        System.out.println("Please enter plain text");
        String nextText = scanner.nextLine();
        String chiperText = Enigma.stringChipher(nextText, 4);
        System.out.println("Your chiper text: ");
        System.out.println(chiperText);

        String deChiperText = Enigma.stringDeChipher(chiperText, 4);
        System.out.println("Your dechipered text: ");
        System.out.println(deChiperText);
    }
}
