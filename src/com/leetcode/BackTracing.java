package com.leetcode;

import java.util.HashSet;

/**
 * Created by summer on 2017/4/20.
 */
public class BackTracing {
    private static int cases = 0;

    public static void main(String[] args) {
        int[][] _array = new int[10][10];
        for (int i = 0;i < 10;i++){
            for(int j = 0;j < 10;j++){
               _array[i][j] =  (int)Math.round(Math.random());
            }
        }
        backtracing(_array, 0, new HashSet<Integer>());
        System.out.println(cases);
    }

    public static void backtracing(int[][] _array, int index, HashSet<Integer> set){
        if(index >= _array.length){
            cases++;
            return;
        }
        int[] tmp_arr = _array[index];
        for(int i = 0; i < tmp_arr.length; i++){
            if (tmp_arr[i]!=0){
                int work = i;
                if(!set.contains(work)){
                    set.add(work);
                    backtracing(_array, index + 1, set);
                    set.remove(work);
                }
            }

        }

    }
}
