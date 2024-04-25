package com.example.day17;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam4 {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Apple", "Banana"),
                Arrays.asList("Cherry", "Date")
        );

        // flatMap 사용 X
        List<List<String>> lists = nestedList.stream()
                .collect(Collectors.toList());
        System.out.println(lists);

        // flatMap 사용
        List<String> list = nestedList.stream()
                .flatMap(Collection::stream)    // 리스트 평탄화
                .collect(Collectors.toList());

        System.out.println(list);

        List<String> l = Arrays.asList("Hello Java!", "Hi Everyone", "Lambda Stream");
        l.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .forEach(System.out::println);

        List<String> l2 = Arrays.asList("1, 2, 5, 7, 6, 9");
        l2.stream()
                .flatMapToInt(s -> {
                            String[] strArr = s.split(",");
                            int[] intArr = new int[strArr.length];
                            for (int i = 0; i < strArr.length; i++) {
                                intArr[i] = Integer.parseInt(strArr[i].trim());
                            }
                            return Arrays.stream(intArr);
                        })
                .forEach(System.out::print);

        System.out.println();
        l2.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .mapToInt(str -> Integer.parseInt(str.trim()))
                .forEach(System.out::print);
    }
}
