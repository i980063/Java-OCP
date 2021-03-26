package com.ocp.day13;

public class EDog implements Animal{

    @Override
    public void move() {
        System.out.println("Walk");
    }

    @Override
    public void eat() {
        System.out.println("Power");
    }
    
}
