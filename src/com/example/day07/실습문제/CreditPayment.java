package com.example.day07.실습문제;

public class CreditPayment implements Payment {
    @Override
    public void precessPayment() {
        System.out.println("신용카드 결제");
    }
}
