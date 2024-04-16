package com.example.day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        System.out.println(map);
        System.out.println(map.get(1));

        Set<Integer> key = map.keySet();
        for(Integer i: key) {
            System.out.print("Key: " + i);
            System.out.println("\tValue: " + map.get(i));
        }
    }
}
