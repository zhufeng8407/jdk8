package com.zhufeng.jdk8;

import java.util.function.Supplier;

public class StudentTest {

    public static void main(String[] args) {
        Supplier<Student> supplier = () -> new Student();
        System.out.println(supplier.get().getName());

        Supplier<Student> supplier2 = Student::new;

        System.out.println(supplier2.get().getName());
    }
}
