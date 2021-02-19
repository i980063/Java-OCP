package com.ocp.day02;
//data class
public class Student {
    //屬性/變數/資產/欄位
    //public String schoolName;//學校
    public static String schoolName;//學校，變成Global(全域)
    public String name;//姓名
    public int age;//年齡
    //方法
    //印出學生資料
    public void print(){
        System.out.printf("%s %s %d\n"
                ,schoolName,name,age);
    }
}
