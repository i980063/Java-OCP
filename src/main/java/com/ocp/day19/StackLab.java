package com.ocp.day19;

import java.util.Scanner;
import java.util.Stack;

public class StackLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入字元:");
        String s =sc.next();
        //String s ="Java";
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : array){
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()); 
        }
 
    }
}
