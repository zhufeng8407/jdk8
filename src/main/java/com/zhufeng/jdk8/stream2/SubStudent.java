package com.zhufeng.jdk8.stream2;

public class SubStudent extends Student {


    public SubStudent(String name, int score) {
        super(name, score);
    }

    @Override
    public String getName() {
        return "";
    }

    private String getStr(String str) {
        return str;
    }

    private Integer getStr(int str) {
        return str;
    }
}
