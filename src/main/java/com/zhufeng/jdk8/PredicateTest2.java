package com.zhufeng.jdk8;

import java.util.function.Predicate;

public class PredicateTest2 {

    public static void main(String[] args) {
        PredicateTest2 test2 = new PredicateTest2();

        System.out.println(test2.isEqual("test").test("test"));
    }

    private Predicate<String> isEqual(Object object) {
        return Predicate.isEqual(object);
    }
}
