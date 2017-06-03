package com.kitcenter.runners.classwork.lesson10;

public class StringRunner {
    public static void main(String[] args) {
        String name = "";
        String center = new String("KT");
        String center2 = new String("KT");
        System.out.println(center == center2);
        System.out.println(center.equals(center2));
        String centerIntern = center.intern();
        String center3 = "KT";
        System.out.println(centerIntern == center3);
        System.out.println(center.isEmpty());
        String text = "3,4,5,6,7,8";
        String[] split = text.split(",");//Ctr+Alt+V
        System.out.println(split[0]);
        System.out.println(text.offsetByCodePoints(5, 2));
        System.out.println(text);

        String palindrome = "moommoo";
        boolean isPalindrome = true;
        for (int i=0; i<palindrome.length()/2; i++){
            isPalindrome = isPalindrome &&
                    (palindrome.charAt(i)==palindrome.charAt
                            (palindrome.length()-i-1));}//need to defined
        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");

        String palindrome1 = "moommoom";
        StringBuilder builder = new
                StringBuilder(palindrome1);
        builder.reverse();
        if (palindrome1.equals(builder.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
