package com.zhufeng.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest6 {

    public static void main(String[] args) {
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2,3),
                Arrays.asList(4,5,6));

        stream.flatMap(List::stream).map(v -> v * v).forEach(System.out::println);
    }
}
