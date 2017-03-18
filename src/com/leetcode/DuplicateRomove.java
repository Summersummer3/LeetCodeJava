package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by summer on 2017/3/9.
 */
public class DuplicateRomove {
    public int removeDuplicates(int[] a){
        if(a.length == 0){
            return 0;
        }

        int b = a[0];
        int count = 0;
        for(int i = 1;i < a.length;i++){
            if(a[i] != b){
                count++;
            }
            b = i;
        }
        return count;
    }

//    public int[] remove(int i, int[] a){
//        for(int j = i;j < a.length - 1; j++){
//            a[j] = a[j + 1];
//        }
//    }
}
