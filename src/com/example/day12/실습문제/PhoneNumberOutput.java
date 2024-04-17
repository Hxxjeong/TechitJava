package com.example.day12.실습문제;

import java.io.BufferedReader;
import java.io.FileReader;

public class PhoneNumberOutput {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("phone.txt"));
        System.out.println("phone.txt의 내용은 다음과 같습니다.");
        String str;
        int lineNumber = 1;
        while((str = br.readLine()) != null) {
            // 홀수 줄과 짝수 줄을 번갈아가면서 출력
            if (lineNumber % 2 == 1) {
                System.out.print(str + " ");
            } else {
                System.out.println(str);
            }
            lineNumber++;
        }
    }
}
