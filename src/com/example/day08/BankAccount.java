package com.example.day08;

public class BankAccount {
    private final int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public final String getAccountInfo() {
        return "계좌 번호: " + accountNumber + ", 잔액: " + balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
