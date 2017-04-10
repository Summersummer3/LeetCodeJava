package com.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by summer on 2017/4/10.
 */
public class PerfectWorld {
    public static int longsetIncreaseSeq(int[] arr){
        Integer[] dp = new Integer[arr.length];
        dp[0] = 1;
        for (int i = 1;i < arr.length;i++){
            int flag = -1;
            for (int j = i - 1;j >= 0;j--){
                if (arr[i] > arr[j]){
                    if (flag == -1){
                        flag = j;
                    }else if (dp[j] > dp[flag]){
                        flag = j;
                    }
                }
            }
            if(flag != -1){
                dp[i] = dp[flag] + 1;
            }else {
                dp[i] = 1;
            }
        }
        return Collections.max(Arrays.asList(dp));
    }

    public static void main(String[] args) {
        int m;
        int arr[];
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n > 0){
            m = scan.nextInt();
            arr = new int[m];
            for (int i = 0;i < m;i++){
                arr[i] = scan.nextInt();
            }
            System.out.println(longsetIncreaseSeq(arr));
            n--;
        }
    }


}
