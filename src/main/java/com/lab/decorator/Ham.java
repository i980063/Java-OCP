package com.lab.decorator;

public class Ham extends SideDish{
    
    public Ham(Food food) {
        super(food);
        super.name = "火腿";//等於name = "火腿";
        super.price = 30;//等於price = 30;
    }
    
}
