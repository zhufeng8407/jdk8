package com.zhufeng.jdk8.stream;

import java.util.stream.Stream;

public class StreamTest3 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "helloworld");

//        String[] strArr = stream.toArray(length -> new String[length]);

        String[] strArr = stream.toArray(String[]::new);

    }
}
