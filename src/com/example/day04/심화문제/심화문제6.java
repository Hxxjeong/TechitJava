package com.example.day04.심화문제;

/*
    6. 이차원 배열에서의 대각선 요소 합계
    int 타입의 이차원 배열 matrix가 주어졌을 때, 두 대각선의 요소 합계를 구하는 코드를 작성하세요. 배열은 정사각형 배열이라고 가정합니다.
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
 */

public class 심화문제6 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++){
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
