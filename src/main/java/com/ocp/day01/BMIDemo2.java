package com.ocp.day01;

public class BMIDemo2 {
    public static void main(String[] args) {
        printBMI("John",170,60);
        printBMI("Mary",155,40);
        printBMI("Helen",163,48);
    }
    public static void printBMI(String name,double height,double weight) {//共用方法
        //計算BMI
        //String name ="John";
        //double height =170;//170.0
        //double weight = 60;
        double result = weight / Math.pow(height/100, 2);
        System.out.printf("%s 的身高: %.1f 體重: %.1f bmi %.2f\n"
                ,name,height,weight,result);
    }
            
}
