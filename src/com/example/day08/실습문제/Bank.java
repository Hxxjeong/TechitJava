package com.example.day08.실습문제;

import com.example.day08.실습문제.Account;
import com.example.day08.실습문제.AccountNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // 통장 개설
    public void addAccount(int accountNumber, String name, int balance) {
        Account account = new Account(accountNumber, name, balance);
        accounts.add(account);
    }

    public Account getAccount(int accountNumber) throws AccountNotFoundException {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        throw new AccountNotFoundException(accountNumber + " 통장을 찾을 수 없습니다.");
    }

    public String getName() {
        return name;
    }
}