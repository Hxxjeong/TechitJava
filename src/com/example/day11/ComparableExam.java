package com.example.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("park");
        list.add("choi");

        Collections.sort(list);
    }
}
