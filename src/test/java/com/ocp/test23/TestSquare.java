package com.ocp.test23;

import com.ocp.day23.Square;
import org.junit.Assert;
import org.junit.Test;

public class TestSquare {
    @Test
    public void test(){
        // 測試要符合 3A 的條件
        // Arrange - 安排(目標物件)
        // Act - 目標方法
        // Assert - 驗證是否符合預期
        
        // Arrange - 安排(目標物件)
        Square square = new Square();
        
        //參數配置
        int h = 10;
        int w = 5;
        
        //期望結果
        int exp = 50;
        
        // Act - 目標方法
        int act = square.getArea(w, h);// Act 表示實際計算的值
       
        // Arrange - 安排(目標物件)
        Assert.assertEquals(exp, act);
        
    }
}
