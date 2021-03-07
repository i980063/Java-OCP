package com.ocp.day04;

//銀行帳戶
public class Account {
    //預設有100元，不寫就是預設0(int money)
    private int money = 100;
    
    
    //餘額查詢的方法
    public void printMoney(){
        //自己得private可以直接用
        System.out.printf("可用餘額：$%d\n",money);
    }
    
    
    //提款的方法
    public void withdrawal(int x){
    System.out.printf("提款 $ %d\n",x);
    
    //驗證提款要件
    //1.驗證提款金額是否 <= 0
    if(x<=0){
        System.out.println("提款金額錯誤!");
        return;//中斷方法
    }
    
    //2.驗證x是否大於目前餘額?
    if(x>money){
        System.out.println("提款金額不足!");
        System.out.printf("可用餘額:$%d\n",money);
        return;//中斷方法
    }
    
    //3.驗證x是否大於10W
    if(x>10_0000){
        System.out.println("提款金額不可超過10萬!");
        System.out.printf("可用餘額:$%d\n",money);
        return;
    }
    
    //4.進行提款程序
    System.out.println("提款成功!");
    money -=x;
    System.out.printf("可用餘額:$%d\n",money);
  
  }
  
    
    //存款方法
    public void deposit(int x){
    System.out.printf("存款 $ %d\n",x);
    //驗證提款要件
    
    //1.驗證存款 > 0
    if(x<=0){
        System.out.println("存款必須大於$0!");
        return;
    }
    
    //2.存款金額一定是要100的倍數
    if(x % 100 !=0){
        System.out.println("存款金額必須$100的倍數!");
        //System.out.printf("可用餘額:$%d\n",money);
        return;
    }
    
    //3.驗證y是否大於10W
    if(x > 10_0000){
        System.out.println("存款金額不可超過10萬!");
        //System.out.printf("可用餘額:$%d\n",money);
        return;
    }
    
    //4.進行提款程序
    money +=x;
    System.out.printf("存款成功，可用餘額:$%d\n",money);
    }
        
   }

