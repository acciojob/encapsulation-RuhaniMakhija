package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj1=new RWOnly();
        obj1.setName("Ruhani");
        String ans=obj1.getName();
        System.out.println(ans);

    }
}