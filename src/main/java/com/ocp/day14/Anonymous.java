package com.ocp.day14;

interface Salary{
    int amount();
}

public class Anonymous {
    public static void main(String[] args) {
        Salary salary = new Salary(){//匿名內部類別
            @Override
            public int amount(){
                return 5_0000;
            }
        };
        
        Salary salart2 = new Salary() {
            @Override
            public int amount() {
                return 8_0000;
            }
        };
        System.out.println(salary.amount());
        System.out.println(salart2.amount());
    }
}