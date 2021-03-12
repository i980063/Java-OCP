package com.ocp.day08;

import java.util.Date;

public class BigData {
    //建構子任務->初始物件變數
    //private String data = "我是一個大資料" + new Date();//預設建構子如下
    private String data;//預設建構子
    private String autor = "交易所";
    private static String version;//統一版本
    
    //物件初始區段(會自動將此區段程式碼配置到所有的建構子內)
    {
        if(new Date().getTime() %2 ==0){
            data = "盤中資料";
        
        }else{
            data = "盤後資料";
        }
    }
    
     // 類別變數初始區段
    static {
        System.out.println("類別初始區段");
        if(new Date().getTime() % 2 == 0) {
            version = "1.0";
        } else {
            version = "2.0";
        }
    }
 
    
    BigData(){
        //前面還是會放初始值
        //if(new Date().getTime() %2 ==0){
            //data = "盤中資料";
        
        //}else{
            //data = "盤後資料";
        //}
        //data = "盤前資料";
    }
    
    @Override
    public String toString() {
        return "BigData{" + "data=" + data + ", autor=" + autor + ", version=" + version + '}';
    }
    
    
}
    
    //public BigData() {
        //data = "我是一個大資料" + new Date();
        //data = "我是小資料";//顯示更新的data
    //}
    

  
    
    
