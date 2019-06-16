package com.zhufeng.jdk8.optional;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");

//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }

        // this is the right usage

        optional.ifPresent(t -> System.out.println(t));

        System.out.println(optional.orElse("is null"));

    }
}
