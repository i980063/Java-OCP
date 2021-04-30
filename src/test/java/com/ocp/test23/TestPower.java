package com.ocp.test23;

import com.ocp.day23.Power;
import org.junit.Assert;
import org.junit.Test;

public class TestPower {

    @Test// 測試 W
    public void testW() {
        // 測試要符合 3A 的條件
        // Arrange - 安排(目標物件)
        // Act - 目標方法
        // Assert - 驗證是否符合預期

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
}
