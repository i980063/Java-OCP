package com.ocp.day16;

public class SexMain {
    public static void main(String[] args) {
        //chickSex(1);
        chickSex(Sex.man);
        chickSex(Sex.female);
    }
    public static void chickSex(Sex sex) {
        switch(sex){
            case man:
                System.out.println("男性");
                break;
            case female:
                System.out.println("女性");
                break;
            default:
                System.err.println("ERROR");
        }
    }
}
