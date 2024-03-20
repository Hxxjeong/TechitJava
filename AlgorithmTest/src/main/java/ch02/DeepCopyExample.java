package ch02;

import java.util.Arrays;

public class DeepCopyExample {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};

        // original 배열을 깊은 복사하여 copied 배열 생성
        int[] copied = Arrays.copyOf(original, original.length);

        original[2] = 100;

        // copied 배열의 내용 출력 (원본 배열이 변화해도 복사된 배열은 변하지 않음)
        System.out.println("copied 배열의 내용:");
        for (int num : copied) {
            System.out.print(num + " ");    // 1 2 3 4 5 출력
        }
    }
}