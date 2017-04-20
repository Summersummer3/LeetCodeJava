package com.leetcode;

import java.util.Scanner;

/**
 * Created by summer on 2017/4/12.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        int arr0;
        for (int i = 0;i < n;i++){
            arr[i] = scan.nextInt();
        }
        for (int j = 0;j < k;j++){
            arr0 = arr[0];
            for (int l = 0;l < n;l++){
                if(l == n - 1){
                    arr[l] = (arr[l] + arr0);
                }
                else {
                    arr[l] = (arr[l] + arr[l + 1]);
                }
                if (arr[l] >= 100){
                    arr[l] = arr[l] % 100;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i:arr){
            sb.append(Integer.toString(i) + " ");
        }
        System.out.println(sb.toString().trim());
    }
}
