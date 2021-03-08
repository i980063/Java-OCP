package com.ocp.day07;

public class WrapperClassDemo {
    public static void main(String[] args) {
        //JAVA 5 之前
        int a = 100;
        Integer b = new Integer(200);
        System.out.println(a + b.intValue());//intValue()物件裡面的數值
        Integer c = Integer.valueOf(300);//new Integer(300);
        
        //JAVA 5 之後可
        System.out.println(a + b);//會自動幫你補auto-unboxing(自動拆箱)
        Integer c1 = 300;//會自動幫你裝箱auto-boxing(自動裝箱)
        /*int 初始值為0s;Integer(外包類別業界常用) 初始值為null*/
        System.out.printf("取的 int 的最大值: %d\n", Integer.MAX_VALUE);
        System.out.println(Integer.max(a, b));
        String chinese = "1";
        String math = "50";
        System.out.println(chinese + math);//字串會變連接
        System.out.println(Integer.parseInt(chinese) + Integer.parseInt(math));//萃取字串裡的數字
        System.out.println("100轉成2進位:" + Integer.toBinaryString(100));
    }
}
