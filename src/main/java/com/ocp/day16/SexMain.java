package com.ocp.day16;

public class SexMain {
    public static void main(String[] args) {
        //chickSex(1);
        chickSex(Sex.man);
        chickSex(3);
    }
    public static void chickSex(int value) {
        switch(value){
            case Sex.man:
                System.err.println("男性");
                break;
            case Sex.female:
                System.err.println("女性");
                break;
            default:
                System.err.println("ERROR");
        }
    }
}
