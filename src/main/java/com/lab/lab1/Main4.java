package com.lab.lab1;

public class Main4 {
    public static void main(String[] args) {
        Employee employee = new Employee(38000);
        
        Manager manager = new Manager(68000);
        manager.setBudget(30000);
        
        Director director = new Director(88000);
        director.setBudget(50000);
        director.setStockOptions(10_0000);
        
        EmployeeUtil util = new EmployeeUtil();
        
        System.out.println(util.getAllSalary(employee ,manager ,director));
        System.out.println(util.getAllBudget(manager ,director));
        System.out.println(util.getAllStockOptions(director));
    }
}
