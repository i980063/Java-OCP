package com.ocp.day18;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        List<Integer> lotto = new ArrayList<>();
        lotto.add(2); // 0
        lotto.add(1); // 1
        lotto.add(4); // 2
        lotto.add(3); // 3
        lotto.add(5); // 4
        System.out.println(lotto);
        Set<Integer> ans = new LinkedHashSet<>();
        Random r = new Random();
        for(int i = 0; i<3; i++){
            int idx = r.nextInt(lotto.size());
            int value = lotto.get(idx);
            ans.add(value);
            lotto.remove(idx);
        }
        System.out.println(lotto);
        System.out.println(ans);
    }
}
