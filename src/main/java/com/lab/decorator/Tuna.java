package com.lab.decorator;

public class Tuna extends SideDish{
    
    public Tuna(Food food) {
        super(food);
        super.name = "鮪魚";//等於name = "鮪魚";
        super.price = 25;//等於price = 25;
    }
    
}
