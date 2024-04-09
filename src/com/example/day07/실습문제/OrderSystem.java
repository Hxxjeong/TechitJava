package com.example.day07.실습문제;

public class OrderSystem {
    public static void main(String[] args) {
        // 피자 주문
        Order pizza = new PizzaOrder();
        pizza.completeOrder();
        Payment credit = new CreditPayment();
        credit.precessPayment();

        System.out.println("===========");

        // 버거 주문
        Order burger = new BurgerOrder();
        burger.completeOrder();
        Payment cash = new CashPayment();
        cash.precessPayment();
    }
}
