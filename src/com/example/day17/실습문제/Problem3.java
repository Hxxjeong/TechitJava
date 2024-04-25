package com.example.day17.실습문제;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 82),
                new Student("Bob", 90),
                new Student("Charlie", 72),
                new Student("David", 76)
        );

        // 성적이 80점 이상인 학생 정렬하여 출력
        List<String> goodStudent = students.stream()
                .filter(s -> s.getScore() >= 80)
                .sorted(Comparator.comparing(Student::getScore))
                .map(Student::getName)  // name만 리스트로 구성
                .collect(Collectors.toList());
        System.out.println(goodStudent);
    }
}
