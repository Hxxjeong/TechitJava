package com.example.day04.실습문제;

/*
    5. 이차원 배열의 선언, 초기화 및 출력
    int 타입의 이차원 배열 matrix를 선언하고, 다음과 같은 형태로 초기화하세요.
    1 2 3
    4 5 6
    7 8 9
 */

public class 실습문제5 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
