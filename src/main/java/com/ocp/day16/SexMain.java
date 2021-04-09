package com.ocp.day16;

public class SexMain {
    public static void main(String[] args) {
        //chickSex(1);
        chickSex(Sex.man);
        chickSex(Sex.females);
    }
    public static void chickSex(Sex sex) {
        switch(sex){
            case man:
                System.err.println("男性");
                break;
            case female:
                System.err.println("女性");
                break;
            default:
                System.err.println("ERROR");
        }
    }
}
