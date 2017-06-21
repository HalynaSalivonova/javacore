package com.kitcenter.runners.classwork.lesson17;


import java.util.ArrayList;
import java.util.Collections;

public class CollectionsRunner {
    public static void main(String[] args) {
        String abc = "abc";
        String abc2 = "abc2";
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(abc);
        arrayList.add(0, abc2);

        int size = arrayList.size();
        System.out.println(arrayList);
        System.out.println(size);

        arrayList.remove(abc);
        arrayList.add(0, abc);

        boolean isContains = arrayList.contains(1);
        System.out.println(isContains);

        boolean isEmpty = arrayList.isEmpty();
        System.out.println(isEmpty);

        int indexOf = arrayList.indexOf(abc2);
        System.out.println(indexOf);

        String obj = arrayList.get(0);
        System.out.println(obj);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
