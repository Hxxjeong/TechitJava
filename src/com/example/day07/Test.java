package com.example.day07;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        String name = child.getName();
        System.out.println(name);

        System.out.println(child);

        Product pen = new Product("black pen", 3000);
        Product pen2 = new Product("black pen", 2000);
        System.out.println(pen);

        if (pen.equals(pen2))
            System.out.println("same things");
        else
            System.out.println("not same!");
    }
}
