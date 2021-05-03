package com.ocp.day24;

public class RaceMain {
    public static void main(String[] args) {
        Race race = new Race();
        Race race2 = new Race();
        //設定執行緒名稱
        race.setName("烏龜");
        race2.setName("兔子");
        //執行緒啟動
        race.start();
        race2.start();
    }
}
