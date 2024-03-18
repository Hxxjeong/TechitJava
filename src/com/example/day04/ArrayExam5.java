package com.example.day04;

import java.util.Arrays;

public class ArrayExam5 {
    public static void main(String[] args) {

        int[] copyFrom = {1, 2, 3};
        int[] copyTo = Arrays.copyOf(copyFrom, copyFrom.length);

        for (int c: copyTo) {
            System.out.println(c);
        }

        System.out.println("=============");
        int[] copyTo2 = Arrays.copyOf(copyFrom, 5);

        // 복사되지 않은 인덱스는 0으로 초기화
        for (int c: copyTo2) {
            System.out.println(c);
        }
    }
}
