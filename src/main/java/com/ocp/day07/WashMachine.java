package com.ocp.day07;

public class WashMachine {
    //BO 商業元件(商業Logic)
    //DO 資料元件(純/存資料)
     
    private boolean isopen;//預設值是false，預設關門
    private boolean havewater;//預設值是false，預設注水
    private int mode ;//預設是0
    //預設建構子，沒參數
    //public WashMachine(){
    //}
    //建構子
    public WashMachine(int mode){
        this.mode = mode;
    }
    //開門
    public void open(){
        System.out.println("開門");
        isopen = true;
    }
     //放衣服
    public void putClothes(){
        if(isopen){
            System.out.println("放衣服");
        }else{
            System.out.println("請先開門");
        }
    }
    //關門
    public void close(){
        System.out.println("關門");
        isopen = false;
    }
    //放水
    public void water(){
        if(!isopen){//if(isopen = false)
            System.out.println("注水");
            havewater = true;
        }else{
            System.out.println("請先關門");
        }
        
    }
    //洗衣
    public void play(){
        //先確認是否注水
        if(!havewater){//if(havewater = true)
            System.out.println("請先柱水");
            return;
        }
        //確認洗衣模式
        switch(mode){
            case 1:
                System.out.println("柔洗模式");
                break;
            case 2:
                System.out.println("強洗模式");
                break;
            case 3:
                System.out.println("靜置模式");
                break;
            default:
                System.out.println("請選擇模式/模式錯誤");
                return;
        }
        //開始洗衣
            System.out.println("開始洗衣服");
            System.out.println("衣服洗完了");
    }
}
