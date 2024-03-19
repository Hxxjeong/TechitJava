package ch02;

import java.util.Scanner;

public class InvertArray {
    public static void swap (int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수의 개수: ");

        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("점수를 입력하세요. 점수는 엔터로 구분됩니다.");
        for (int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i=0; i< array.length/2; i++) {
            swap(array, i, array.length-i-1);
            System.out.println(array[i]);
        }

    }
}
