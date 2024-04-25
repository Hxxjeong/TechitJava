package com.example.day17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingTest {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("kim", 33, Member.MALE),
                new Member("lee", 26, Member.FEMALE),
                new Member("park", 11, Member.FEMALE),
                new Member("choi", 47, Member.MALE)
        );

        // 성별을 기준으로 그룹화
        Map<Integer, List<Member>> mapBySex = members.stream()
                .collect(Collectors.groupingBy(Member::getSex));
        System.out.println("Male: ");
        mapBySex.get(Member.MALE).stream()
                .forEach(m -> System.out.print(m.getName() + " "));
        System.out.println("\nFemale: ");
        mapBySex.get(Member.FEMALE).stream()
                .forEach(m -> System.out.print(m.getName() + " "));
    }
}
