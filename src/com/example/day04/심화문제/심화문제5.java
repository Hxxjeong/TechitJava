package com.example.day04.심화문제;

/*
    5. 두 배열의 합집합 구하기
    int 타입의 두 배열 array1과 array2가 주어졌을 때, 두 배열의 합집합을 구하여 새 배열에 저장하고, 결과 배열을 출력하는 코드를 작성하세요. 합집합 배열에는 중복된 요소가 없어야 합니다.
    int[] array1 = {1, 3, 5, 7, 9};
    int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};
 */

import java.util.LinkedHashSet;

public class 심화문제5 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};

        // LinkedHashSet 사용 (Python의 Set과 비슷한 역할, 넣은 순서대로 중복을 제거하여 출력)
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : array1) {
            set.add(num);
        }
        for (int num : array2) {
            set.add(num);
        }

        // HashSet을 배열로 변환
        Integer[] newArray = set.toArray(new Integer[0]);

        // 결과 출력
        for (int n: newArray)
            System.out.printf(n + " ");
    }
}
