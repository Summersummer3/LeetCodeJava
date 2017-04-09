package com.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by summer on 2017/4/9.
 */
public class MaxSumOfSubArr {
    int[] arr;
    MaxSumOfSubArr(int[] arr){
        this.arr = arr;
    }
    public int sum(){
        Integer[] dp = new Integer[this.arr.length];
        dp[0] = this.arr[0];
        for (int i = 1;i < this.arr.length;i++){
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
        }
        int max = Collections.max(Arrays.asList(dp));
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String str = scan.nextLine();
            MaxSumOfSubArr m;
            int[] arr;
            int i;
            while (str != null) {
                i = 0;
                String[] s = str.split(", ");
                arr = new int[s.length];
                for (String s0 : s) {
                    arr[i] = Integer.parseInt(s0);
                    i++;
                }
                m = new MaxSumOfSubArr(arr);
                System.out.println(m.sum());
                str = scan.nextLine();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}