package com.ocp.day03.food;

import com.ocp.day03.bar.A;

public class C extends A{
    void i_want_money(){
        //因為 money 得存取權限是 protected
         //C可透過 extends(繼承) 就可以存取
        //不同資料夾要import(原package需要public)
        //A a = new A();//繼承不用new
        //System.out.println(a.money);
        System.out.println(money);//繼承直接取A，不用打a.
    }
}
