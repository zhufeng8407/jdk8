package com.zhufeng.jdk8.leetcode;

public class MaxArea {

    public static void main(String[] args) {
        MaxArea maxArea = new MaxArea();

        System.out.println(maxArea.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public int maxArea(int[] height) {

        int result = 0;
        for (int i = 0; i < height.length - 1; i++) {

            int ai = height[i];
            for (int j = i; j < height.length; j++) {

                int aj = height[j];
                int subArea = 0;
                if (aj < ai)
                    subArea = (j-i) * aj;
                else
                    subArea = (j - i) * ai;

                result = result > subArea ? result : subArea;

            }
        }

        return result;
    }
}
