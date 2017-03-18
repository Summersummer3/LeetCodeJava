package com.leetcode;

import java.util.Stack;

/**
 * Created by summer on 2017/3/9.
 */
public class MyPow {
    public double myPow(double x, int n) {
        double a = 1;
        int flag;
        Stack<Integer> stack = decimalToBinary(n);
        int b =stack.pop();
        if(b == 0)
            flag = 0;
        else if(b == 2)
            flag = 2;
        else
            flag = 1;

        while(!stack.isEmpty()){
            if(stack.pop() == 1){
                a = a * a * x;
            }
            else{
                a = a * a;
            }
        }
        if(flag == 0)
            return 1/a;
        else if(flag == 2)
            return 1/(a * x);
        else
            return a;
    }

    public Stack<Integer> decimalToBinary(int n){
        int a;
        int flag = 1;
        Stack<Integer> stack= new Stack<Integer>();
        if(n < 0){
            if(n == -2147483648) {
                n = n - 1;
                flag = 2;
            }
            else {
                n = 0 - n;
                flag = 0;
            }
        }
        while(n != 0) {
            a = n % 2;
            n = n / 2;
            stack.push(a);
        }
        stack.push(flag);
        return stack;
    }

}
