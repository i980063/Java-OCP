package com.ocp.day14;

//interface Sub<T>{//泛型
    //T calc(T x , T y );
//}

interface Sub{//泛型
    int calc(int x , int y );
}

class SubImpl implements Sub{

    @Override
    public int calc(int x, int y) {
        return x - y;
    }
   
}

public class Anonymous4 {
    public static void main(String[] args) {
        Sub sub1 = new SubImpl();
        System.out.println(sub1.calc(10, 20));
        //透過匿名內部類別
        Sub sub2 = new Sub() {
            @Override
            public int calc(int x, int y) {
                return x - y;
            }
        };
        System.out.println(sub2.calc(10, 40));
        //JAVA 8 Lambda
        Sub sub3 = (int x ,int y) -> {return x - y;};
        //JAVA 8 Lambda省略
        Sub sub4 = (int x ,int y) -> x - y;//return可以省略
        //JAVA 8 最精簡
        Sub sub5 = (x ,y) -> x - y;
        
        System.out.println(sub5.calc(10, 60));
    }
}
