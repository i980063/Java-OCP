package com.lab1;

public class Main5 {
    public static void main(String[] args) {
        //取得公差一員
        EmployeeUtil util = new EmployeeUtil();
        Employee emp = util.getRandonEmployee();
        System.out.println(emp.getClass().getSimpleName());
        System.out.println("Salary:" + emp.getSalary());
        if(emp instanceof Manager){
            Manager m = (Manager)emp;//將 emp 轉型成 Manager
            System.out.println("Budget:" + m.getBudget());
        }
        
        if(emp instanceof Director){
            Director d = (Director)emp;//將 emp 轉型成 Director
            System.out.println("Budget:" + d.getBudget());
            System.out.println("Stock Options:" + d.getStockOptions());
        }
    }
}
