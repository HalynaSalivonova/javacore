package com.kitcenter.runners.homework.hometask10;


import com.kitcenter.app.homework.lesson10.Palindromes;

import java.util.Scanner;

public class PalindromesRunner {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Palindromes palindromes = new Palindromes();
        System.out.println("Please enter some text");
        Scanner scanner = new Scanner(System.in);
        String palindrome_1 = scanner.nextLine();
        palindromes.firstPalindrome(palindrome_1);

        System.out.println("Please enter some text");
        String palindrome_2 = scanner.nextLine();
        palindromes.secondPalindrome(palindrome_2);


        System.out.println("Please enter some text");
        String palindrome_3 = scanner.nextLine();
        palindromes.thirdPalindrome(palindrome_3);
    }
}
