package com.kitcenter.app.homework.lesson12;


public class Palindrome {
    public String palindromeMethod(String palindrome){
        String reverse = new StringBuffer(palindrome).reverse().toString();
        if (palindrome.equalsIgnoreCase(reverse))
            return " is palindrome";
        else
            return " isn't palindrome";
    }
}
