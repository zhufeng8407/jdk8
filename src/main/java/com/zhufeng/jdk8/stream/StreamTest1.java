package com.zhufeng.jdk8.stream;

import java.util.stream.IntStream;

public class StreamTest1 {

    public static void main(String[] args) {

        IntStream.of(new int[]{5,7,6,8})
                .forEach(System.out::println);

        System.out.println("===============");

        IntStream.range(3,8).forEach(System.out::println);
    }
}