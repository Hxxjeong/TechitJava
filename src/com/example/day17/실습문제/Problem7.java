package com.example.day17.실습문제;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem7 {
    public static void main(String[] args) {
        List<Temperature> temperatures = Arrays.asList(
                new Temperature("Seoul", 33),
                new Temperature("New York", 30),
                new Temperature("Seoul", 34),
                new Temperature("New York", 28)
        );
        
        // 각 도시의 최고 온도
        Map<String, List<Temperature>> city = temperatures.stream()
                .collect(Collectors.groupingBy(Temperature::getCity));

        city.forEach((c, temp) -> {
            double max = temp.stream()
                    .mapToDouble(Temperature::getMaxTemp)
                    .max().orElse(0);
            System.out.println(c + ": " + max);
        });
    }
}
