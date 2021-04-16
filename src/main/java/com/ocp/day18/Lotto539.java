package com.ocp.day18;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Lotto539 {
    // 樂透 539 電腦選號(1~39取5個不重複的數字)
    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> lotto539 = new LinkedHashSet<>();
        while (lotto539.size() < 5) {            
            int n = r.nextInt(39) + 1;
            //System.out.printf("n = %d\n", n);
            lotto539.add(n);//加入到集合
        }
        System.out.println(lotto539);
    }
}
