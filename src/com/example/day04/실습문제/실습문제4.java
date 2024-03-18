package com.example.day04.실습문제;

/*
    4. for-each 문을 사용한 배열 요소 출력
    int 타입의 배열 numbers가 다음과 같이 초기화되어 있습니다.
    int[] numbers = {5, 10, 15, 20, 25};
 */

public class 실습문제4 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        for (int n: numbers) {
            System.out.println(n);
        }
    }
}
