package com.zhufeng.jdk8.methodreference;

public class Student {

    private String name;

    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static int compareByScore(Student student1, Student student2) {
        return student1.score - student2.score;
    }

    public static int compareByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    public int compareByStudetScore(Student student) {
        return this.score - student.getScore();
    }
}
