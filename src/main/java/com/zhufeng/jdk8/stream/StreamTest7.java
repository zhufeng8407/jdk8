package com.zhufeng.jdk8.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest7 {

    public static void main(String[] args) {
        Stream.iterate(1, v -> v + 2).limit(6).forEach(System.out::println);

        System.out.println("====================");

        // 不是最好的做法

//        System.out.println(Stream.iterate(1, v -> v + 2).limit(6).filter(v -> v > 2).map(v -> v * 2).skip(2).limit(2)
//                .reduce(0, Integer::sum));

        System.out.println(Stream.iterate(1, v -> v + 2).limit(6).filter(v -> v > 2).mapToInt(v -> v * 2).skip(2).limit(2)
                .sum());

        System.out.println("====================");
        IntSummaryStatistics summaryStatistics = Stream.iterate(1, v -> v + 2).limit(6).filter(v -> v > 2).mapToInt(v -> v * 2).skip(2).limit(2)
                .summaryStatistics();

        System.out.println(summaryStatistics.getSum() + ", max is " + summaryStatistics.getMax());
    }

}
