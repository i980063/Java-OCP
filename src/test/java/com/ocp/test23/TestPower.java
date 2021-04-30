package com.ocp.test23;

import com.ocp.day23.Power;
import org.junit.Assert;
import org.junit.Test;

public class TestPower {

    @Test// 測試 W
    public void testW() {
        // Arrange - 安排(目標物件)
        Power square = new Power();

        //參數配置
        int v = 10;
        int a = 100;

        //期望結果
        int exp =1000;

        // Act - 目標方法
        int act = square.getW(v, a);// Act 表示實際計算的值

        // Arrange - 安排(目標物件)
        Assert.assertEquals(exp, act);
    }
    
    @Test// 測試 V
    public void testV() {
        // Arrange - 安排(目標物件)
        Power square = new Power();

        //參數配置
        int W = 1000;
        int a = 100;

        //期望結果
        int exp =10;

        // Act - 目標方法
        int act = square.getV(W, a);// Act 表示實際計算的值

        // Arrange - 安排(目標物件)
        Assert.assertEquals(exp, act);
    }
    
    @Test// 測試 A
    public void testA() {
        // Arrange - 安排(目標物件)
        Power square = new Power();

        //參數配置
        int W = 1000;
        int v = 10;

        //期望結果
        int exp =100;

        // Act - 目標方法
        int act = square.getA(W, v);// Act 表示實際計算的值

        // Arrange - 安排(目標物件)
        Assert.assertEquals(exp, act);
    }
}
