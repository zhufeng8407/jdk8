package com.zhufeng.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest8 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello1", "world", "hello world");

        list.stream().mapToInt(t -> {
            int length = t.length();
            System.out.println(t);
            return length;
        }).filter(t -> t == 5).findFirst().ifPresent(System.out::println);
    }
}
