package com.ocp.day24;

public class MaryMain {
    public static void main(String[] args) {
        Runnable job1 = new Programming();
        Runnable job2 = new Report();
        Thread mary = new Thread(job2, "Mary");
        mary.start();
    }
}
