package com.ocp.day09;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        //員工資料
        Employee e1 = new Employee("John",new Salary(30000, 5000));
        Employee e2 = new Employee("Mary",new Salary(70000, 8000));
        Employee e3 = new Employee("Helen",new Salary(50000, 6000));
        
        //部門類別
        Employee[] itemployees = {e1,e2};
        Employee[] salesemployees = {e2,e3};
        
        //IT部門薪水加總
        int sum = Stream.
                  of(itemployees).
                  mapToInt(e -> e.getSalary().gerMoney())//從原本的型態"陣列"map轉換To變成Int(e(代號=e1,e2員工)的(.)薪資的(.)Moiney)
                  .sum();
        System.out.printf("IT部門薪水加總 $%,d\n",sum);
        //IT部門統計資料
        IntSummaryStatistics stat = Stream.
                  of(itemployees).
                  mapToInt(e -> e.getSalary().gerMoney())//從原本的型態"陣列"map轉換To變成Int(e(代號=e1,e2員工)的(.)薪資的(.)Moiney)
                  .summaryStatistics();
        System.out.printf("IT部門統計 $%,d\n",stat.getSum() );
        
        //SALES部門薪水加總
        int sum3 = Stream.
                  of(salesemployees).
                  mapToInt(e -> e.getSalary().gerMoney())//從原本的型態"陣列"map轉換To變成Int(e(代號=e1,e2員工)的(.)薪資的(.)Moiney)
                  .sum();
        System.out.printf("SALES部門薪水加總 $%,d\n",sum3);

    }
}
