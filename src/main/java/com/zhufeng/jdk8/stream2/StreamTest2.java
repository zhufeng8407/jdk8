package com.zhufeng.jdk8.stream2;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamTest2 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 80);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 100);
        Student student4 = new Student("zhaoliu", 90);
        Student student5 = new Student("zhaoliu", 90);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);

        students.stream().collect(minBy(Comparator.comparingInt(Student::getScore)))
                .ifPresent(System.out::println);

        students.stream().collect(maxBy(Comparator.comparingInt(Student::getScore)))
                .ifPresent(System.out::println);


        System.out.println(students.stream().collect(averagingInt(Student::getScore)));

        System.out.println("=============================");

        Map<Integer, Map<String, List<Student>>> map = students.stream().collect(groupingBy(Student::getScore, groupingBy(Student::getName)));

        System.out.println(map);

        System.out.println(students.stream().collect(partitioningBy(t -> t.getScore() >= 80)));

        Map<Boolean, Map<Boolean, List<Student>>> map2 = students.stream().collect(partitioningBy(t -> t.getScore() > 80, partitioningBy(st -> st.getScore() > 90)));
        System.out.println(map2);

        System.out.println("==============================");

        Map<String, Student> map3 = students.stream().collect(groupingBy(Student::getName,
                collectingAndThen(minBy(Comparator.comparingInt(Student::getScore)), Optional::get)));

        System.out.println(map3);
    }
}
