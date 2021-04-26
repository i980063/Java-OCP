package com.ocp.day21;

import java.util.Scanner;

public class CircleComputer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入半徑:");

        try {
        double r = sc.nextDouble();
        double area = Math.pow(r, 2) * Math.PI;
        System.out.printf("area: %.2f\n", area);
        } catch (Exception e) {
            System.out.println("輸入錯誤");
            System.out.println("錯誤原因" + e);
            System.out.println("請重新輸入");
            main(args);
        }
    }
}
