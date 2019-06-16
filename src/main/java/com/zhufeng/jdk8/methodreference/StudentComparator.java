package com.zhufeng.jdk8.methodreference;

public class StudentComparator {

    public int compareByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

}
