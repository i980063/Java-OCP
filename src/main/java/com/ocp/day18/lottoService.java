package com.ocp.day18;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class lottoService {
    static Random r = new Random();
    public static Set<Integer> get539(){
        Set<Integer> lotto = new LinkedHashSet<>();
        while (lotto.size() < 5) {            
            lotto.add(r.nextInt(39) + 1);//加入到集合
            String str = "%02d" + lotto;
        }
        return lotto;
    }
    
    public static List<Integer> get4Stars() {
        List<Integer> lotto = new ArrayList<>();
        for(int i=0;i<4;i++) {
            lotto.add(r.nextInt(10) + 1); // 0~9
        }
        return lotto;
    }
    
    public static Set<Integer> getBig(){
        Set<Integer> lotto = new LinkedHashSet<>();
        while (lotto.size() < 7) {            
            lotto.add(r.nextInt(41) + 1);//加入到集合
        }
        return lotto;
    }
}
