package com.zhufeng.jdk8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest5 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "helloworld");

        String str = stream.collect(Collectors.joining());
        System.out.println(str);
    }
}
