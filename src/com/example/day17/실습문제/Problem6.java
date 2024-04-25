package com.example.day17.실습문제;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem6 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 14, 88),
                new Student("Bob", 23, 82),
                new Student("Charlie", 17, 95),
                new Student("David", 21, 73)
        );
        
        // 나이대 별 평균 점수
        Map<Integer, List<Student>> age = students.stream()
                .collect(Collectors.groupingBy(s -> s.getAge() / 10));

        age.forEach((a, score) -> {
            double avg = score.stream()
                    .mapToDouble(Student::getScore)
                    .average().orElse(0);
            System.out.println(a + "0s: " + avg);
        });
    }
}
