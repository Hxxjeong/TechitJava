package ch06;

import java.util.Arrays;

public class SelectionSortTest {
    static void selectionSort(int[] array) {
//        // 최소값 찾기
//        int min = array[0];
//        for (int i=0; i< array.length; i++) {
//            if (min > array[i]) {
//                swap(array, i, 0);
//            }
//        }
//
//        for (int i=1; i< array.length; i++) {
//            for (int j=i+1; j< array.length; j++) {
//                if (array[i] > array[j])
//                    swap(array, i, j);
//            }
//        }

        for (int i=0; i<array.length-1; i++) {
            int min = i;
            for(int j=i+1; j< array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
    }

    static void swap (int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {64, 33, 67, 22, 6, 88, 5};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
