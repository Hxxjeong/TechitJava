package ch06;

import java.util.Arrays;

public class BubbleSortTest {
    static int[] bubbleSort(int[] array) {
        for (int i=0; i< array.length-1; i++) {
            for(int j=0; j< array.length-i-1; j++) {    // 한 사이클이 돌면 마지막 요소 하나가 정렬됨
                if (array[j] > array[j+1]) {    // 인접한 요소를 비교
                    swap(array, j, j+1);
                }
            }
        }
        return array;
    }

    static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {64, 33, 67, 22, 6, 88, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
