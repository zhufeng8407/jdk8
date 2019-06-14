package com.zhufeng.jdk8;

import java.util.function.Function;

public class FunctionTest2 {

    public static void main(String[] args) {
        FunctionTest2 test2 = new FunctionTest2();

        System.out.println(test2.compute(2, v -> v * 3, v -> v*v));

        System.out.println(test2.compute2(2, v -> v*3, v -> v*v));

    }

    private int compute(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    private int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }
}
