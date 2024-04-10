package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> a = new ArrayList<>();
        a.add("String");
        a.add(1);
        System.out.println("a.get(0) = " + a.get(0));
        System.out.println("a.get(1) = " + a.get(1));

        System.out.println("Hello world!");
    }
}