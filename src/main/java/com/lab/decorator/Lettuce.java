package com.lab.decorator;

public class Lettuce extends SideDish{
    
    public Lettuce(Food food) {
        super(food);
        super.name = "生菜";//等於name = "生菜";
        super.price = 15;//等於price = 15;
    }
    
}
