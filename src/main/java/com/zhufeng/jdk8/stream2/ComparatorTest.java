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

//        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());
//
//        Collections.sort(list, Comparator.comparingInt((Object item) -> 1).reversed());

//        System.out.println(list);

//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing((s1, s2) -> s1.compareToIgnoreCase(s2)));

//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));

//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));


//         Collections.sort(list, Comparator.comparingInt(String::length)
//                 .thenComparing(String::toLowerCase, Comparator.reverseOrder()));

        Collections.sort(list, Comparator.comparingInt(String::length).reversed()
                .thenComparing(String::toLowerCase, Comparator.reverseOrder()));
        System.out.println(list);
    }


}
