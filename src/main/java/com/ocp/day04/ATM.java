package com.ocp.day04;

//主程式
public class ATM {
    public static void main(String[] args) {
     Account act = new Account();
        //1.物件的屬性，若直接對外暴露，是不安全的
        //2.屬性如何變成不暴露:設定為private
        //3.自訂義相關方法:
        //3.1 查詢餘額
        //3.2 提$$
        //3.3 存%%
        //System.out.printf("$%d\n",act.money);
        //act.money += 100;
        //System.out.printf("$%d\n",act.money);
        //act.money -=200;
        //System.out.printf("$%d\n",act.money);
        
        act.printMoney();
        
        act.withdrawal(70);
        act.withdrawal(50);
        act.withdrawal(-50);
        act.withdrawal(70);
        act.withdrawal(103000);
        
        act.deposit(50);
        act.deposit(80);
        act.deposit(-100);
        
        act.deposit(120000);
        act.deposit(90000);
        act.deposit(90000);
        
        act.withdrawal(103000);
        act.withdrawal(3000);
        
    }
    
}
