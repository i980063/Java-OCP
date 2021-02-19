package com.ocp.day01;

public class BMIDemo3 {
    public static void main(String[] args) {
        //呼叫共用資源
        BMIDemo2.printBMI("David", 185, 81);
        BMIDemo2.printBMI("Sing", 153.7, 46.9);
        BMIDemo2.printBMI("Git", 177.3, 73.7);
    }
}
