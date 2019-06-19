package com.zhufeng.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "helloworld");

//        String[] strArr = stream.toArray(String[]::new);
//
//        Arrays.asList(strArr).forEach(System.out::println);

//        List<String> strList = stream.collect(Collectors.toList());

//        List<String> strList = stream.collect(ArrayList::new, (list, v) -> list.add(v),
//                (list1, list2) -> list1.addAll(list2));
//        strList.forEach(System.out::println);

        Set<String> strSet = stream.collect(Collectors.toCollection(TreeSet::new));

        strSet.forEach(System.out::println);
    }
}
