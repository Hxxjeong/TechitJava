package com.example.day08.실습문제;

public class BankExam {
    public static void main(String[] args) {

        Account account = new Account(1234, "abc", 12300);

        // 잔액보다 많이 출금
        try {
            account.withdraw(20000);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("==================");

        Bank bank = new Bank("abc");
        bank.addAccount(5678, "aaa", 333);

        // 존재하지 않는 계좌 번호 조회
        try {
            bank.getAccount(333);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
