package com.ocp.day02;

public class School {
    public static void main(String[] args) {
                    //新建一個Student在記憶體
    
        Student s1 = new Student();
        Student s2 = new Student();
        s1.print();
        s2.print();
        //s1.schoolName = "台大";
        //s1.schoolName = "師大";
        //s2.schoolName = "成大";//只看最新更新，全域變數
        Student.schoolName = "師大";
        s1.name = "John";
        s1.age = 20;
        //s2.schoolName = "台大";
        s2.name = "Helen";
        s2.age = 21;
        s1.print();
        s2.print();
    }
}
