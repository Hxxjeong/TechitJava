package ch02;

import java.util.Arrays;

import static java.lang.System.*;

public class ArrayCompare {

    static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4};

        System.out.println("array1과 array2 동일? " + areArraysEqual(array1, array2));
        System.out.println("array1과 array3 동일? " + areArraysEqual(array1, array3));
    }
}
