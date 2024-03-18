package com.example.day04;

import java.util.Scanner;

class Cal {
    public int plus (int... value) {
        int sum = 0;
        for (int v: value) {
            sum += v;
        }
        return sum;
    }
}
public class CalTest {
    public static void main(String[] args) {
        Cal cal = new Cal();

        Scanner sc = new Scanner(System.in);
        System.out.println("더할 숫자들을 입력하세요. 숫자는 공백으로 구분되며 엔터를 입력하면 결과가 나옵니다.");
        String input = sc.nextLine();

        String[] tokens = input.split(" "); // 공백을 기준으로 분할
        int[] values = new int[tokens.length]; // 분할된 문자열을 정수 배열로 변환
        for (int i = 0; i < tokens.length; i++) {
            values[i] = Integer.parseInt(tokens[i]);
        }

        int result = cal.plus(values);
        System.out.println(result);

        sc.close();
    }
}
