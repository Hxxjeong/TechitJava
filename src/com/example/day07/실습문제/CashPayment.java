package com.example.day07.실습문제;

public class CashPayment implements Payment {
    @Override
    public void precessPayment() {
        System.out.println("현금 결제");
    }
}
