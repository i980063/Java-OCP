package com.ocp.day24;

// 要給執行緒執行的工作任務
public class Programming implements Runnable{
    
    @Override
    public void run(){//寫程式的工作
        System.out.println("寫 JAVA 程式");
    }
}
