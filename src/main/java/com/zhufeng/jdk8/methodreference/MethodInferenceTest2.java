package com.zhufeng.jdk8.methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodInferenceTest2 {

    public String getString(Supplier<String> supplier) {
        return supplier.get() + "test";
    }

    public String getString(String str, Function<String, String> function) {
        return function.apply(str) + "test2";
    }

    public static void main(String[] args) {
        MethodInferenceTest2 test2 = new MethodInferenceTest2();
        System.out.println(test2.getString(String::new));

        System.out.println(test2.getString("app", String::new));

    }
}
