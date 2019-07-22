package com.zhufeng.jdk8.leetcode;

public class Test771 {



    public int numJewelsInStones(String J, String S) {

        int count = 0;
        for(int i = 0; i < J.length(); i++) {
            char ch = J.charAt(i);
            if (S.contains(String.valueOf(ch))) {
                for (int j = 0; j < S.length(); j++) {
                    if (S.charAt(j) == ch) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
