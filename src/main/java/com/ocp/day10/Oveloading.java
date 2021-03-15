package com.ocp.day10;

public class Oveloading {
    public static void print(Integer x) {
        System.out.println("Integer : " + x);
    }
    public static void print(int x) {
        System.out.println("int : " + x);
    }
    public static void print(double x) {
        System.out.println("double :　" + x);
    }
    public static void print(float x) {
        System.out.println("float : " + x);
    }
    public static void main(String[] args) {
        print(100);//先比對基本資料型別，如都沒基本資料型別才會Boxing參考資料型別
        print(Integer.valueOf(100));//先比對參考資料型別，如都參考資料型別才會unBoxing基本資料型別
    }
 
}
