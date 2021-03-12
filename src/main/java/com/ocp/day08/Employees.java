package com.ocp.day08;

import java.util.stream.Stream;

public class Employees {
    private String[] employees = {"John","Marry","Helen"};
    
    //SingleTon(設計模式)
    //自行建立一個 Static Employees 物件(實體)
    private static Employees _instance = new Employees();
    //設定 private 建構子
    private Employees(){

    }
    //提供一個 public static方法讓外界得到ˋ你建立的唯一物件(實例)
    public static Employees getEmployees(){
        return _instance;
    }
        
    
    public void print() {
        Stream.of(employees).forEach(System.out::println);
        //Stream.of(employees).forEach(e -> System.out.println(e));
        //for(String e : employees){
            //System.out.println(e);
        //}
    }
}
