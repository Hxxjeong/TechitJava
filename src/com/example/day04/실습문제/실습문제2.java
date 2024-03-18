package com.example.day04.실습문제;

/*
    2. 배열의 값 출력
    double 타입의 배열 doubles가 다음과 같이 초기화되어 있습니다.
    double[] doubles = {1.0, 2.5, 3.7, 4.4};
 */

public class 실습문제2 {
    public static void main(String[] args) {
        double[] doubles = {1.0, 2.5, 3.7, 4.4};

        for (double d: doubles) {
            System.out.println(d);
        }
    }
}
