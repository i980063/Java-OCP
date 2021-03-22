package com.lab.decorator;

public class Onion extends SideDish{
    
    public Onion(Food food) {
        super(food);
        super.name = "洋蔥";//等於name = "洋蔥";
        super.price = 12;//等於price = 12;
    }
    
}
