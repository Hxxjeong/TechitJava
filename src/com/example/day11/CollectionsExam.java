package com.example.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExam {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=10; i++)
            list.add(i);

        System.out.println("섞기 전 리스트");
        for(Integer i:list)
            System.out.print(i + " ");

        Collections.shuffle(list);

        System.out.println("\n=================");
        System.out.println("섞은 후 리스트");
        for(Integer i: list)
            System.out.print(i + " ");
    }
}
