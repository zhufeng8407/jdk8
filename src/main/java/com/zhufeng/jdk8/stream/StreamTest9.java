package com.zhufeng.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest9 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello welcome", "world hello",
                "hello world hello", "hello welcome");
        list.stream().flatMap(v -> Arrays.stream(v.split(" ")))
                .distinct().forEach(System.out::println);
    }
}
