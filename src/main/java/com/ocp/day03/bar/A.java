package com.ocp.day03.bar;

public class A {
    //public int money = 100;//全部皆可存取(要import)
    //int money = 100; //同一個package才可存取使用(無修飾字元)(default)，繼承也不行
    //private int money = 100; //只有A(自己)可以使用，繼承也不行
    protected int money = 100;
    //同一個package(B)可以直接取用，不同package要繼承(extends)才能取用
    //C有繼承，D沒有，所以D不能繼承
}
