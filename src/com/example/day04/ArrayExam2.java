package com.example.day04;

public class ArrayExam2 {
    public static void main(String[] args) {
        ItemForArray[] array1 = new ItemForArray[3];

        array1[0] = new ItemForArray(1000, "pen");
        array1[1] = new ItemForArray(300, "apple");
        array1[2] = new ItemForArray(900, "watermelon");

        // item의 목록 출력
        for (ItemForArray item: array1) {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
        }
    }
}
