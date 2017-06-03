package com.kitcenter.app.classwork.lesson11;


public class StringBuild {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();//Incorrect implementation according to performance
        String c = "start";
        String b = "finish";
        for (long i = 0; i < 100000L; i++)
            c = c.concat(b);
        long end = System.currentTimeMillis();
        System.out.println(end - start);


        long start1 = System.currentTimeMillis();
        StringBuilder a = new StringBuilder("start");//Correct implementation according to performance
        String d = "finish";
        for(long i = 0;i< 100000L;i++)
            a =a.append(d);
            long end1 = System.currentTimeMillis();
        System.out.println(end1 -start1);
    }
}