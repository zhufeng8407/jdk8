package com.zhufeng.jdk8.stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao", "hello", "world", "welcome");

//        list.stream().sorted(String::compareToIgnoreCase).forEach(System.out::println);

//        list.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

//        list.stream().sorted(Comparator.comparingInt(t -> t.length())).forEach(System.out::println);

        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());

        Collections.sort(list, Comparator.comparingInt((Object item) -> 1).reversed());

        System.out.println(list);

    }
}
