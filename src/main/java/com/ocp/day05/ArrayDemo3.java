package com.ocp.day05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //全班有6個人此次考數學的成績列表
        int[] scores1 = {80,90,90,100,40,50};
        System.out.printf("數學:%s\n",Arrays.toString(scores1));
        
        int sum = IntStream.of(scores1).sum();//串流
        double avg = IntStream.of(scores1).average().getAsDouble();//串流
        System.out.printf("總分:%s\n",sum);
        System.out.printf("平均:%.1f\n",avg);
        
        //請問 及格總分與平均
        //JAVA 7
        sum = 0;
        for(int x :scores1){
            if(x>=60){
                sum += x;
            }
        }
        System.out.printf("及格的總分:%s\n",sum);
        
        //JAVA 8
        sum = IntStream.of(scores1).
                filter(x -> x >= 60)//filter設定條件`，過濾及格分數
                .sum();
        System.out.printf("及格的總分:%s\n",sum);
        
        avg = IntStream.of(scores1)
                .filter(x -> x >= 60)//過濾及格分數
                .average()//得到平均
                .getAsDouble();//取得平均的 double 資料
        System.out.printf("平均:%.1f\n",avg);
    }
}
