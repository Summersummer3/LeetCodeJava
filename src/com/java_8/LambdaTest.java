package com.java_8;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;


/**
 * Created by summer on 2017/3/31.
 */

public class LambdaTest {
    public static void main(String[] args) {
        /**
         * replace the abstract class
         */

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("before java 8");
            }
        }).start();
        new Thread( () -> System.out.println("now is java 8")).start();

        /**
         *Predict class for functional programing
         */

        List<String> strss = Arrays.asList("My", "Life", "is", "suck");
        String[] strs = {"My", "Life", "is", "suck"};
        filter(strs, (String str) -> (int)str.charAt(0) >= (int)'A' && (int)str.charAt(0) <= (int)'Z');
        filter(strss, (String str) -> (int)str.charAt(0) >= (int)'A' && (int)str.charAt(0) <= (int)'Z');

        /**
         * Map/Reduce example
         * List.stream() in java 8
         */
        List<Integer> prices = Arrays.asList(100, 200, 300, 400);
        Stream<Double> st = prices.stream().map((Integer price) -> price + price * .12);
        Double max_1 = st.reduce(Math::max).get();
//        st.forEach(System.out::println);// this stream can be used only one time!
        int max = prices.stream().reduce(Math::max).get();
        System.out.println(max_1);
    }

    public static void filter(List<String> strs, Predicate<String> condition){
        strs.forEach(str -> {
            if (condition.test(str)) {
                System.out.println(str + " ");
            }
        });

    }

    public static void filter(String[] strs, Predicate<String> condition){
        for(String str: strs){
            if(condition.test(str)){
                System.out.println(str + " ");
            }
        }
    }

}
