package ch02;

import java.util.Scanner;

public class RedixConverter {
    static int convertToRadix(int x, int radix, char[] d) {
        int digit = 0;
        String digitChars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digit++] = digitChars.charAt(x % radix);  // 나머지가 10을 넘어가는 경우 맞는 숫자로 변환하기 위함
            x /= radix;
        } while (x != 0);

        // 배열 역순 출력
        for (int i=0; i<digit/2; i++) {
            char tmp = d[i];
            d[i] = d[digit - i - 1];
            d[digit - i - 1] = tmp;
        }

        return digit;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;          // 변환할 10진수 정수
        int radix;           // 변환할 기수
        int digitNum;        // 변환 후 자릿수
        int retry;           // 반복 여부
        char[] result = new char[32]; // 변환 결과를 저장할 배열

        System.out.println("10진수를 다른 기수로 변환합니다.");
        do {
            do {
                System.out.print("변환할 정수(0 이상): ");
                number = input.nextInt();
            } while (number < 0);

            do {
                System.out.print("변환할 기수(2~36): ");
                radix = input.nextInt();
            } while (radix < 2 || radix > 36);

            digitNum = convertToRadix(number, radix, result);

            // 자릿수까지만 반복문 돌기
            System.out.print(radix + "진수로는 ");
            for (int i = 0; i < digitNum; i++)
                System.out.print(result[i]);
            System.out.println(" 입니다.");

            System.out.print("한 번 더 할까요? (1.예 / 0.아니오): ");
            retry = input.nextInt();
        } while (retry == 1);
    }
}