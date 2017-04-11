package com.leetcode;


import java.util.*;

/**
 * Created by summer on 2017/4/10.
 */
public class PerfectWorld {
    public static Integer[] longsetIncreaseSeq(int[] arr){
        Integer[] dp = new Integer[arr.length];
        Integer[] flags = new Integer[arr.length];
        List<Integer> lst = new ArrayList<>();
        Integer[] res;
        dp[0] = 1;
        flags[0] = -1;
        int max = 0;
        int maxPos = 0;

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
            flags[i] = flag;
        }
        for (int k = 0;k < dp.length; k++){
            if (dp[k] > max){
                max = dp[k];
                maxPos = k;
            }
        }
        int l = maxPos;
        lst.add(arr[maxPos]);
        while(flags[l] != -1){
            l = flags[l];
            lst.add(arr[l]);
        }
        res = new Integer[lst.size()];
        for (int m = 0;m < lst.size();m++){
            res[m] = lst.get(lst.size() - 1 - m);
        }
        return res;
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
            Integer[] res = longsetIncreaseSeq(arr);
            StringBuffer sb = new StringBuffer();
            for (Integer r:res){
                sb.append(r.toString() + " ");
            }
            System.out.println(sb.toString().trim());
            n--;
        }
    }

}
