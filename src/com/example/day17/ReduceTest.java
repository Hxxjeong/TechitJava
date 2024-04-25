package com.example.day17;

import java.util.Arrays;
import java.util.List;

public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int sum = list.stream()
                .reduce(0, (a, b) -> a + b);    // 초기값, 람다식(초기값, 리스트의 원소)
        System.out.println(sum);

        List<Member> members = Arrays.asList(
                new Member("kim", 100),
                new Member("lee", 90),
                new Member("park", 80),
                new Member("choi", 70)
        );

        // member score의 합
        int memberSum = members.stream()
                .mapToInt(Member::getScore) // Integer를 int로 변환
                .sum();
        System.out.println(memberSum);


        int memberSum2 = members.stream()
                .mapToInt(Member::getScore)
                .reduce(0, (a, b) -> a + b);
        System.out.println(memberSum2);
    }
}
