package com.example.day04;

public class ArrayExam4 {
    public static void main(String[] args) {
        // 배열에서 최대값과 최소값 찾기
        double[] doubles = {1.5, 3.7, 2.4, 3.7};

        double max = doubles[0];
        double min = doubles[0];

        for (double d: doubles) {
            if (max < d)
                max = d;
            if (min > d)
                min = d;
        }

        System.out.println("최댓값: " + max + ", 최소값: " + min);
    }
}
