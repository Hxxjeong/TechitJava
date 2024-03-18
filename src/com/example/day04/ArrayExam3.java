package com.example.day04;

public class ArrayExam3 {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        arr[0][1] = 10;
        
        int[][] arr2 = new int[3][];    // 2행은 생성이 안 된 상태
        arr2[0] = new int[3];
        arr2[1] = new int[2];
        arr2[2] = new int[10];

        int[][] array = new int[2][];
        array[0] = new int[2];
        array[1] = new int[3];
        array[0][0] = 0;
        array[0][1] = 1;
        array[1][0] = 2;
        array[1][1] = 3;
        array[1][2] = 4;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
