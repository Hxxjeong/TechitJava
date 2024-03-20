package ch03;

import java.util.Arrays;

public class SearchExam {

    // 순차 검색
    static int sequentialSearch (int[] array, int key) {
        for (int i=0; i<array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;  // 찾지 못한 경우
    }

    // 이진 검색
    static int binarySearch (int[] array, int key) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // key가 중간값인 경우
            if (key == array[mid])
                return mid;

            // key가 중간값보다 큰 경우
            else if (key > array[mid])
                start = mid + 1;

            // key가 중간값보다 작은 경우
            else
                end = mid - 1;
        }

        return -1;  // 찾지 못한 경우
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 33, 56, 2, 44};

        int index = sequentialSearch(arr, 33);

        Arrays.sort(arr);
        int index2 = binarySearch(arr, 33);
        System.out.println(index);
        System.out.println(index2);
    }
}
