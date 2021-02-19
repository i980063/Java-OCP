package com.ocp.day02;

public class Student {
    //屬性
    public String schoolName;//學校
    public String name;//姓名
    public String age;//年齡
    //方法
    //印出學生資料
    public void print(){
        System.out.printf("%s %s %s\n",schoolName,name,age);
    }
}
