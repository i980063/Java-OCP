package com.lab.decorator;

public class SideDish extends Food{//配菜是食物
    private Food food;//非常重要的觀念，SideDish有Food的(配菜裡有食物)
    
    public SideDish(Food food) {
        this.food = food;
    }

    @Override
    public String getName() {
        return  name + "+" + food.getName();
    }

    @Override
    public int getPrice() {
        return price + food.getPrice();
    }
    
}
