package com.zhufeng.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("hello", "world", "hello world");

        strs.forEach(v -> System.out.println(v));

        strs.forEach(System.out::println);
    }
}
