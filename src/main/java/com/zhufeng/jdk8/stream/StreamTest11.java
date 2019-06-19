package com.zhufeng.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest11 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 20);
        Student student3 = new Student("wangwu", 90, 30);
        Student student4 = new Student("zhaoliu", 80, 40);

        List<Student> list = Arrays.asList(student1, student2, student3, student4);
        
    }
}
