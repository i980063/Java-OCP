package com.ocp.day09;

//工具類別
public class Util {
    //兩數相加
    public static int add(int x, int y){//工具類別，大家都一樣的算法、演算法
        if(x >=50000){
            return x + 2*y;
        }
        return x + y;
    }
}
