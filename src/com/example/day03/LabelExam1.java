package com.example.day03;

public class LabelExam1 {
    public static void main(String[] args) {
        outter:
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");

                if (j == 5)
                    break outter;   // label을 붙이면 가장 바깥쪽의 반복문을 빠져나감
            }
            System.out.println();
        }
    }
}
