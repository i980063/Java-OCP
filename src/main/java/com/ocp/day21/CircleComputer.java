package com.ocp.day21;

import java.util.Scanner;

public class CircleComputer {

    static int count = 0;

    public static void main(String[] args) {
        if (count >= 3) {
            System.out.println("錯誤次數太多");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入半徑:");
        //count++;

        try {
            double r = sc.nextDouble();
            double area = Math.pow(r, 2) * Math.PI;
            System.out.printf("area: %.2f\n", area);
        } catch (Exception e) {
            System.out.println("輸入錯誤，錯誤次數:" + count);
            System.out.println("錯誤原因" + e);
            System.out.println("請重新輸入");
            main(args);
        }finally{
            count++;
        }

    }
}
