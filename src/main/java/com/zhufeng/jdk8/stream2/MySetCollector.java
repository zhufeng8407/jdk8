package com.zhufeng.jdk8.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MySetCollector<T> implements Collector<T, Set<T>, Map<T, T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked");
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked");
        return (set, item) -> {
//            System.out.println("accumulator: " + set + ", " +Thread.currentThread().getName());»áµ¼ÖÂ
            set.add(item);
        };
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked");
        return (left, right) -> {left.addAll(right);
            System.out.println("combiner is: "+ Thread.currentThread().getName());
        return left;};
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher invoked");
        return set -> { Map map = new HashMap();
          set.forEach(t -> map.put(t, t));
          return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(String.class.getClassLoader());
//        String.class.getClassLoader().loadClass("java.lang.String", )

        List<String> list = Arrays.asList("nihao", "hello", "world", "welcome", "hello");

        Map<String, String> map = list.parallelStream().collect(new MySetCollector<>());
        System.out.println(map);
    }
}
