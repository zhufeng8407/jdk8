package com.zhufeng.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {

    public static void main(String[] args) {
        Student student = new Student("zhangsan", 10);
        Student student1 = new Student("lisi", 50);
        Student student2 = new Student("wangwu", 40);
        Student student3 = new Student("zhaoliu", 20);

        List<Student> students = Arrays.asList(student, student1, student2, student3);

//        students.sort((stu, stu1) -> Student.compareByScore(stu, stu1));
//
//        students.forEach(t -> System.out.println(t.getScore()));

        System.out.println("========================");

//        students.sort(Student::compareByScore);
//        students.forEach(t -> System.out.println(t.getScore()));

//        students.sort(Student::compareByStudetScore); //这个方法是
//        students.forEach(t -> System.out.println(t.getScore()));

        List<String> cities = Arrays.asList("qingdao", "chongqing", "tianjin", "beijing");

        cities.sort(String::compareToIgnoreCase);


    }
}
