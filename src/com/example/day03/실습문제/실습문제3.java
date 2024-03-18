package com.example.day03.실습문제;

/*
    실습 문제 3: 구구단 출력기
    while 루프를 사용하여 2단부터 9단까지의 구구단을 출력하는 프로그램을 작성하세요. 각 단은 한 줄에 하나씩 출력되어야 합니다.
 */
public class 실습문제3 {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 9) {
            int dan = 2;
            while (dan <= 9) {
                System.out.printf("%d*%d=%d \t", dan, i, i*dan);
                dan++;
            }
            System.out.println();
            i++;
        }
    }
}
