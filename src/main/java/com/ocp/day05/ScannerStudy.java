package com.ocp.day05;
//預設會import java.lang.*;(舉凡System、Math...)
import java.util.Scanner;
//import java.util.*;(util底下的全部，但不符合企業使用原則)

public class ScannerStudy {
    public static void main(String[] args) {
        //java.util.Scanner sc = new java.util.Scanner(System.in);
        Scanner sc = new Scanner("170.0 60 小明的資料 明天 228 放假");
        double h = sc.nextDouble();
        int w = sc.nextInt();
        //String s = sc.next();
        String all = sc.nextLine();//剩餘全部的資料
        System.out.println(h);
        System.out.println(w);
        //System.out.println(s);
        System.out.println(all);
        System.out.println("請輸入任意字串:");
        //Scanner sc2 = new Scanner(System.in);
        //String any = sc.nextLine();
        //String any = new Scanner(System.in).nextLine();//簡化寫法
        //System.out.printf("您所輸入的是:%s\n",any);
        System.out.printf("您所輸入的是:%s\n",new Scanner(System.in).nextLine());//最簡化寫法
    }
  
}
