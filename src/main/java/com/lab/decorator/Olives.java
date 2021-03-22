package com.lab.decorator;

public class Olives extends SideDish{
    
    public Olives(Food food) {
        super(food);
        super.name = "橄欖";//等於name = "橄欖";
        super.price = 10;//等於price = 10;
    }
    
}
