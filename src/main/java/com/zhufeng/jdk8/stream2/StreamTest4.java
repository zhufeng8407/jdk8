package com.zhufeng.jdk8.stream2;

import java.util.Arrays;
import java.util.List;

public class StreamTest4 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world", "welcome", "person", "Student");

//        list.stream().forEach(System.out::println);

        list.parallelStream().forEach(System.out::println);
    }
}
