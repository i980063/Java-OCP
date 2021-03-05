package com.ocp.day06;

public class StringUpdate {
    public static void updateString(String x) {
       x = x.concat("8");
    }
    
    public static void updateStringBuilder(StringBuilder y) {//(StringBuilder y)區域變數
        //y = y.append("8");
        y.append("8");//與上面答案一樣
    }
    
    public static void main(String[] args) {
        String x = "Java";
        StringBuilder y = new StringBuilder("Java");
        
        updateString(x);//只有執行沒有接續，所以就被刪除了
        updateStringBuilder(y);
        System.out.println(x);//第11行的
        System.out.println(y);
    }
}
