package com.example.day17.실습문제;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem5 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.00),
                new Product("Smartphone", "Electronics", 700.00),
                new Product("Desk", "Furniture", 300.00),
                new Product("Chair", "Furniture", 150.00)
        );
        
        // 카테고리 별 평균 가격
        Map<String, List<Product>> category = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        category.forEach((cate, price) -> {
            double avg = price.stream()
                    .mapToDouble(Product::getPrice)
                    .average().orElse(0);
            System.out.println(cate + ": " + avg);
        });
    }
}
