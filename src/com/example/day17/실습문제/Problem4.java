package com.example.day17.실습문제;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem4 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 3000),
                new Employee("Bob", "HR", 2000),
                new Employee("Charlie", "Engineering", 5000),
                new Employee("David", "Engineering", 4000)
        );
        
        // 부서 별 평균 급여
        Map<String, List<Employee>> department = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        department.forEach((dept, empList) -> {
            double averageSalary = empList.stream()
                    .mapToDouble(Employee::getSalary)
                    .average()
                    .orElse(0);
            System.out.println(dept + ": " + averageSalary);
        });
    }
}
