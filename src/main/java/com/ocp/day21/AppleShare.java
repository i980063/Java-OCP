package com.ocp.day21;

import java.util.Scanner;

public class AppleShare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入人數：");
        int n =sc.nextInt();//n代表人數

        try {
            submit(n);
        } catch (Exception e) {
            System.out.println("錯誤原因：" + e.getMessage());
        }
        
    }
    
    public static void submit(int n ) {//n代表人數
        if(n <=0){
            ArithmeticException e = new ArithmeticException("n <= 0");
            throw e;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入蘋果數量:");
        int apple = sc.nextInt();
        int result = 0;
        result = apple / n;
        System.out.println("一人可分得:" + result + "顆");
    }
}
