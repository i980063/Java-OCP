package com.ocp.day13;

public interface Animal {
    void move();
    default void eat(){//JAVA8 新增介面預設方法，好讓implement不用全部實作  
        System.out.println("Eat Food");
    }
}
