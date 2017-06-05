package com.kitcenter.app.homework.lesson10;


public class Palindromes {
    public void firstPalindrome(String palindrome){
        palindrome = palindrome.toLowerCase();
        boolean isPalindrome = true;
        for(int i=0; i<palindrome.length()/2; i++){
        isPalindrome = isPalindrome &&
            (palindrome.charAt(i)==palindrome.charAt
                 (palindrome.length()-i-1));
        }
        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public void secondPalindrome(String palindrome){
        String reverse = new StringBuffer(palindrome).reverse().toString();
        if (palindrome.equalsIgnoreCase(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public void thirdPalindrome(String palindrome){
        palindrome = palindrome.toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0, j = palindrome.length() - 1; i < j; i ++, j --) {
            if (palindrome.charAt(i) != palindrome.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
     }
}
