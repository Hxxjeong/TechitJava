package com.example.day03.실습문제;

import java.util.Random;
import java.util.Scanner;

/*
    실습 문제 5: 숫자 맞히기 게임
    프로그램이 1부터 100 사이의 임의의 숫자를 선택하고, 사용자가 그 숫자를 맞추도록 하는 게임을 만드세요. 사용자가 숫자를 입력할 때마다, 프로그램은 사용자의 입력이 정답보다 큰지, 작은지, 또는 정답인지를 알려주어야 합니다. 사용자가 정답을 맞출 때까지 이 과정을 반복하세요. while 루프와 if-else 문을 사용하여 구현하세요.
 */
public class 실습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int answer = r.nextInt(100) + 1;    // 0 ~ 99 사이의 정수에서 bound를 1씩 더함

        while (true) {
            System.out.println("숫자를 입력하세요.");
            int num = sc.nextInt();

            if (num > answer)
                System.out.println("정답보다 숫자가 큽니다.");
            else if (num < answer)
                System.out.println("정답보다 숫자가 작습니다.");
            else {
                System.out.println("정답입니다. 정답은 " + answer + "입니다.");
                break;
            }
        }
    }
}
