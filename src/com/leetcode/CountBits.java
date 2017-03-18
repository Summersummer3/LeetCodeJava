package com.leetcode;

import java.util.ArrayList;

/**
 * Created by summer on 2017/3/11.
 */
public class CountBits {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        int exp = 0;
        for(int i = 0;i <= num;i++) {
            if (exp == 0) {
               res[i] = i;
            }
            else if (i < Math.pow(2, exp) + Math.pow(2, exp - 1)){
                res[i] = res[i - (int)Math.pow(2, exp - 1)];
            }
            else {
                res[i] = res[i - (int)Math.pow(2, exp - 1)] + 1;
            }
            if (i == Math.pow(2, exp + 1) - 1){
                exp++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        CountBits c = new CountBits();
        int[] arr = c.countBits(5);
        for(int i : arr) {
            System.out.println(i);
        }
    }
}


