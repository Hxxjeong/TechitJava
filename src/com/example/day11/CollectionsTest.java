package com.example.day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        int[] numbers = {1, 2, 2, 3, 4};

        for(int i: numbers) {
            list.add(i);
            set.add(i);
        }

        System.out.println(list);
        System.out.println(set);
    }
}
