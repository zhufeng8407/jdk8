package com.zhufeng.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        PredicateTest test = new PredicateTest();
//        test.getList(list, v -> v%2 == 0).forEach(System.out::println);
//
//        test.getList(list, v -> v%2 != 0).forEach(System.out::println);
//
//        test.getList(list, v -> v > 5).forEach(System.out::println);


//        test.conditionOnFilter(list, v -> v%2 == 0, t -> t > 5);
//
//        test.conditionOnFilter2(list, v -> v%2 == 0, t -> t > 5);

        test.conditionOnFilter3(list, t -> t > 5, v -> v%2 == 0 );

        System.out.println("==================");

        test.conditionOnFilter4(list, t -> t > 5, v -> v%2 == 0 );
    }


    private List<Integer> getList(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream().filter(t -> predicate.test(t)).collect(Collectors.toList());
    }

    private void conditionOnFilter(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        for (Integer value : list) {
            if (predicate.and(predicate2).test(value)) {
                System.out.println(value);
            }
        }
    }

    private void conditionOnFilter2(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        for (Integer value : list) {
            if (predicate.or(predicate2).test(value)) {
                System.out.println(value);
            }
        }
    }

    private void conditionOnFilter3(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        for (Integer value : list) {
            if (predicate.and(predicate2.negate()).test(value)) {
                System.out.println(value);
            }
        }
    }

    private void conditionOnFilter4(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        for (Integer value : list) {
            if (predicate.and(predicate2).negate().test(value)) {
                System.out.println(value);
            }
        }
    }
}
