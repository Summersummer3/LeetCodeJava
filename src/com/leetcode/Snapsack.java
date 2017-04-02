package com.leetcode;

import java.util.Scanner;

/**
 * Created by summer on 2017/4/2.
 */
public class Snapsack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int[] lst = new int[n];
            int sum = 0;
            for(int i=0; i<lst.length; i++){
                lst[i] = scan.nextInt() / 1024;
                sum += lst[i];
            }
            int capacity = sum / 2;
            int[] dp = new int[capacity + 1];
            for(int j=0; j < dp.length; j++){
                dp[j] = 0;
            }
            for(int val: lst){
                for(int k = capacity; k > 0; k--){
                    if(val <= k){
                        dp[k] = Math.max(val + dp[k - val], dp[k]);
                    }
                }
            }
            System.out.println((sum - dp[capacity]) * 1024);
        }

    }

}
