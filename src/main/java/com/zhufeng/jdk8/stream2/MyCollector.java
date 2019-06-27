package com.zhufeng.jdk8.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MyCollector<T> implements Collector<T, List<T>, List<T>> {

    @Override
    public Supplier<List<T>> supplier() {
        System.out.println("supplier invoked");
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<T>, T> accumulator() {
        System.out.println("accumulator imvoked");
//        return (list, t) -> list.add(t);
        return List::add;
    }

    @Override
    public BinaryOperator<List<T>> combiner() {
        System.out.println("combiner invoked");
        return (left, right) -> {left.addAll(right);
            System.out.println(left);return left;};
    }

    @Override
    public Function<List<T>, List<T>> finisher() {
        System.out.println("finisher invoked");
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH, Characteristics.UNORDERED));
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"nihao", "hello", "world", "welcome"};

        Arrays.stream(strs).collect(new MyCollector<String>());
    }
}
