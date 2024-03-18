package com.example.day04;

public class ArrayExam1 {
    public static void main(String[] args) {

        // 배열의 선언
        int[] arr;
        int arr2[];

        // 배열의 생성
        arr = new int[3];
        
        // array1, 2, 3은 배열이지만 array4는 int형
        int[] array1, array2;
        int array3[], array4;

        // 배열의 값 출력
        int[] array = {0, 1, 2};
        for (int i: array) {
            System.out.println(i);
        }

        // for-each 문과 동일
        for (int i=0; i<array.length; i++) {
            int v = array[i];
            System.out.println(v);
        }
    }
}
