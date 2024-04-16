package com.example.day11.실습문제;

import java.util.HashSet;
import java.util.Set;

public class EmployeeManager {
    Set<Employee> set = new HashSet<>();
    public void addEmployee(Employee e) {
        set.add(e);
        System.out.println("추가 후 직원 목록: " + set);
    }

    public void findEmployee(String id) {
        for(Employee e: set) {
            if(e.getId().equals(id)) {
                System.out.println(e);
            }
        }
    }

    public void removeEmployee(Employee e) {
        if(!set.remove(e))
            System.out.println("존재하지 않는 사원입니다.");
    }
}