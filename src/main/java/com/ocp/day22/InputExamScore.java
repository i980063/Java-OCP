package com.ocp.day22;

import java.util.Scanner;

public class InputExamScore {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int score =  sc.nextInt();
        //System.out.println("請輸入分數:");
        int score = 90;
        try {
            check(score);
        } catch (Exception e) {
            System.out.println("score: " + score +
                               ", 錯誤原因: " + e.getMessage());
        }
    }
    
    public static void check(int score) throws Exception {
        // 檢驗參數
        if(score < 0 || score > 100) {
            Exception e = new Exception("分數必須介於0~100之間");
            throw e;
        }
        
        if(score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
