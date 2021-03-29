package com.ocp.day15;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> salary = (principleSalary , bonus) -> principleSalary + bonus;
        System.out.println(salary.apply(50000, 15000));
        
        Integer[] lengths = {10 ,20, 30};//正方形邊長
        UnaryOperator<Integer> area = (t) -> t * t;
        Function<Integer ,Integer> area2 = (t) -> t * t; //一般Function
        Stream.of(lengths).
                map(area).
                //mapToInt(t -> area.apply(t)).
                forEach(System.out::println);
    }
}
