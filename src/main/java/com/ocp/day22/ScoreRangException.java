package com.ocp.day22;

public class ScoreRangException extends Exception{

    public ScoreRangException(int score) {
        super(score + "沒有在0~100之間");
    }
    
    public void 怎麼辦(){
        System.out.println("請重新輸入");
    }
}
