package com.example.day11.실습문제;

public class EmployeeManagerDemo {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(new Employee("홍길동", "E01", "HR"));
        manager.addEmployee(new Employee("김철수", "E02", "Marketing"));
        manager.addEmployee(new Employee("홍길동", "E01", "HR")); // 중복 추가 시도

        manager.findEmployee("E01");
        manager.removeEmployee(new Employee("홍길동", "E01", "HR"));
        manager.findEmployee("E01");
        manager.removeEmployee(new Employee("아무개", "E03", "IT"));   // 없는 직원 삭제
    }
}