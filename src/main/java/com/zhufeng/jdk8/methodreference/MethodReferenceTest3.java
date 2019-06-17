package com.zhufeng.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest3 {

    public static void main(String[] args) {
        Student student = new Student("20180801", 10);
        Student student1 = new Student("20180901", 50);
        Student student2 = new Student("20191111", 40);
        Student student3 = new Student("20190501", 20);

        List<Student> students = Arrays.asList(student, student1, student2, student3);

        StudentComparator studentComparator = new StudentComparator();
        students.sort(studentComparator::compareByName);

        System.out.println(students);
    }
}
