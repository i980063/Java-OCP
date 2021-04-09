package com.ocp.day16;

//PENNY = 1美分 , NICLE = 5美分 , DIME = 10美分 , QUARTER = 25美分
public enum USCurrency {
    PENNY(1),NICLE(5),DIME(20),QUARTER(25);
    private int value;
    
    private USCurrency(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
