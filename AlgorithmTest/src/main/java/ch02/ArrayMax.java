package ch02;

import java.util.Scanner;

public class ArrayMax {

    // 배열의 최대값
    public static int max(int[] array) {
        int max = array[0];
        for(int x: array) {
            if (max < x)
                max = x;
        }
        return max;
    }

    // 학생의 점수가 있는 배열
    static int[] inputScores() {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수의 개수를 입력하세요.");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("입력한 개수만큼 점수를 입력하세요. 점수는 엔터로 구분됩니다.");
        for (int i=0; i< array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = inputScores();

        System.out.println("최댓값은 " + max(array) + "입니다.");
    }
}
