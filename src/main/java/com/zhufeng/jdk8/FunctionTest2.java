package com.zhufeng.jdk8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest2 {

    public static void main(String[] args) {
        FunctionTest2 test2 = new FunctionTest2();

//        System.out.println(test2.compute(2, v -> v * 3, v -> v*v));
//
//        System.out.println(test2.compute2(2, v -> v*3, v -> v*v));

        System.out.println(test2.compute3(2, 3, (v1, v2) -> v1 + v2));

        System.out.println(test2.compute4(3, 5, (v1, v2) -> v1 + v2, v -> v * v));

    }

    private int compute(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    private int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

    private int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    private int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction,
                         Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }
}
