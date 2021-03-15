package com.ocp.day10;

public class Family {
    public static void main(String[] args) {
        Son son = new Son();//一個物件，但是內涵父類別物件
        /*先建立父類別的物件在建立兒子類別的物件*/
        son.hobby();
    }
}
