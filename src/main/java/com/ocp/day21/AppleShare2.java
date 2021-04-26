package com.ocp.day21;

import java.util.Scanner;

public class AppleShare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入人數：");
        int n =sc.nextInt();//n代表人數

        try {
            submit(n);
        } catch (Exception e) {
            System.out.println("錯誤原因：" + e.getMessage());
            System.out.println("錯誤原因：" + e.getLocalizedMessage());
            e.printStackTrace(System.out);//印出程式碼詳細資訊
            System.out.println(e);
        }
        
        
    }
    
    public static void submit(int n ) throws Exception{//n代表人數
        if(n <=0){
            Exception e = new Exception("n <= 0");
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
