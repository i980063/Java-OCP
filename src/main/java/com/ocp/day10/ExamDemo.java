package com.ocp.day10;

class Bar {

    Bar() {
        System.out.println("A");
    }
    Bar(int x) {
        this();//呼叫自己的建構子(Bar(){})
        System.out.println("B");
    }
}

class Foo extends Bar {

    Foo() {
        this(10);//this()呼叫自己有int的建構子(Foo(int x){})
        System.out.println("C");
    }
    Foo(int x) {//Foo的建構子
        super(20);//呼叫父類別有int的建構子(Bar(int x){})
        System.out.println("D");
    }

}

public class ExamDemo {
    public static void main(String[] args) {
       new Foo();//ABDC
    }
}
