package com.ocp.day10;

public class Son extends Father{

    public Son() {
        System.out.println("兒子被建立");
    }
    
    @Override
    public void hobby() {
        super.hobby();//父類別 = super class，呼叫super的hobby
        System.out.println("LOL");//修改成自己的hobby
    }
    
}
