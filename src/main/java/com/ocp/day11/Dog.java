package com.ocp.day11;

public class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("汪汪");
    }

    @Override
    public void sleep() {
        System.out.println("zzz");
    }
    
}
