package com.example.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("kim", 33));
        list.add(new Person("Choi", 23));
        list.add(new Person("Park", 22));

        Collections.sort(list); // Comparable을 이용한 정렬 (나이순)
        System.out.println(list);

        // Comparator를 이용한 정렬 (이름순)
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println(list);
    }
}
