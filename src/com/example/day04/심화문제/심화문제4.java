package com.example.day04.심화문제;

/*
     4. 배열 요소의 이동
    String 타입의 배열 words가 있을 때, 모든 요소를 한 칸씩 오른쪽으로 이동시키는 코드를 작성하세요.
    마지막 요소는 배열의 첫 번째 요소로 이동해야 합니다.
    String[] words = {"Java", "Python", "C", "JavaScript"};
    출력 예시: {"JavaScript", "Java", "Python", "C"}
 */

public class 심화문제4 {
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C", "JavaScript"};
        int length = words.length;
        String temp = words[length - 1]; // 마지막 요소를 임시 변수에 저장

        // 배열의 모든 요소를 한 칸씩 오른쪽으로 이동
        for (int i = length - 1; i > 0; i--) {
            words[i] = words[i - 1];
        }

        // 임시 변수에 저장된 값을 배열의 첫 번째 요소로 이동
        words[0] = temp;

        // 결과 출력
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
