package com.zhufeng.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    public static void main(String[] args) {
        System.out.println(BinaryOperatorTest.arithmetic(2, 3, (a, b) -> a + b));


        System.out.println(BinaryOperatorTest.getMin("hello123", "world", Comparator.comparingInt(String::length)));

    }


    private static Integer arithmetic(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    private static String getMin(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}
