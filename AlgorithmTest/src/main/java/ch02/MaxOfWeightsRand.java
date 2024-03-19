package ch02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfWeightsRand {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("사람의 수를 입력하세요. ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i=0; i<array.length; i++) {
            array[i] = r.nextInt(40, 101);
            System.out.println(array[i] + "kg");
        }

        System.out.println("최대 몸무게는 " + ArrayMax.max(array) + "kg입니다.");
    }
}
