package com.zhufeng.jdk8.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest3 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "hello world");

        try(Stream<String> stream = list.stream()) {

            stream.onClose(() -> {
                System.out.println("first onClose");
                throw new NullPointerException("first NullPointerException");
            }).onClose(() -> {
                System.out.println("second onClose");
                throw new NullPointerException("second NullPointerException");
            });

        }
    }
}
