package com.ocp.day09;

public class Salary {
  private int principalsalary;//本薪，物件變數在每個物件不一樣的時候屬於變數
  private int bonus;//獎金，物件變數在每個物件不一樣的時候屬於變數

    public Salary(int principalsalary, int bonus) {
        this.principalsalary = principalsalary;
        this.bonus = bonus;
    }
  
    public int gerSalary(){
      int money = Util.add(principalsalary, bonus);
      return money;
  }
}
