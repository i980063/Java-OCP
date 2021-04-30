package com.ocp.day22;

import java.util.Scanner;

public class InputExamScore2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score =  sc.nextInt();
        System.out.println("請輸入分數:");
        //int score = 90;
        try {
            check(score);
        } catch (ScoreRangException e) {
            System.out.println(e.getMessage());
            e.怎麼辦();
        }
    }
    
    public static void check(int score) throws ScoreRangException {
        // 檢驗參數
        if(score < 0 || score > 100) {
            ScoreRangException e = new ScoreRangException(score);
            throw e;
        }
        
        if(score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
