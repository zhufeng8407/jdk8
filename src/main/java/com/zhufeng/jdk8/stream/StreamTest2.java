package com.zhufeng.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,4,7,8);

        System.out.println(list.stream().map(v -> v * 2).reduce((v1, v2) -> v1 + v2).get());

        System.out.println(list.stream().map(v -> v * 2).reduce(0, Integer::sum));
    }
}
