
package com.ocp.day19;

import java.util.HashMap;
import java.util.List;
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9, 這個List李相加=9的兩個組合
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1] 要回傳List
*/
public class Homework_TwoSum {

    public static void main(String[] args) {
        
    }
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = m.get(target - nums[i]);
                break;
            }
            m.put(nums[i], i);
        }
        return res;
    }
    //public static List<Integer> twoSum(List<Integer> nums, int target) {
        //return null;
    //}
}
