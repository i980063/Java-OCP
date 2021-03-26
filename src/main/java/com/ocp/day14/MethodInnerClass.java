package com.ocp.day14;

public class MethodInnerClass {
    void foo(){
        int y = 2;
        //y =3 ;
        class  Hello {
            void print() {
                System.out.println(y);
            }
        }
    }
}
