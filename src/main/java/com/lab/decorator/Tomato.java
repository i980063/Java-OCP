package com.lab.decorator;

public class Tomato extends SideDish{
    
    public Tomato(Food food) {
        super(food);
        super.name = "番茄";//等於name = "番茄";
        super.price = 15;//等於price = 15;
    }
    
}
