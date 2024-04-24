package com.example.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaExam4 {
    public static void main(String[] args) {
        // 정적 메소드 참조
        BiFunction<Integer, Integer, Integer> maxFunc = Math::max;
//        BiFunction<Integer, Integer, Integer> maxFunc = (a, b) -> Math.max(a, b);
        System.out.println(maxFunc.apply(3, 5));

        // 인스턴스 메소드 참조
        String str = "Hello world";
        Supplier<Integer> length = str::length;
        System.out.println(length.get());

        // 임의 객체의 인스턴스 메소드 참조
        List<String> lang = Arrays.asList("C", "C++", "Java", "Python");
        List<Integer> lengths = new ArrayList<>();
        Function<String, Integer> lengthFunc = String::length;
        for(String s: lang) {
            lengths.add(lengthFunc.apply(s));
        }
        System.out.println(lengths);

        // 생성자 참조
        Supplier<List<Integer>> listSupplier = ArrayList::new;
        List<Integer> list = listSupplier.get();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }
}
