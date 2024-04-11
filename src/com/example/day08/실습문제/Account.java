package com.example.day08.실습문제;

public class Account {
    int accountNumber;  // 계좌번호
    String name;    // 예금주
    int balance;    // 잔액

    public Account() {
    }

    public Account(int accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        try {
            return accountNumber;
        }
        catch (Exception e) {
            throw new AccountNotFoundException("요청한 계좌 번호가 존재하지 않습니다.");
        }
    }

    // 입금
    public void deposit(double amount) {
        balance += amount;
    }

    // 출금
    public void withdraw(double amount) {
        if(balance < amount) {
            throw new InsufficientException("출금 금액이 잔액보다 큽니다.");
        }
        else
            balance -= amount;
    }
}
