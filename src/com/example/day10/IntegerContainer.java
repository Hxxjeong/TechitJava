package com.example.day10;

public class IntegerContainer implements Container<Integer> {
    private int value;
    @Override
    public void set(Integer value) {
        this.value = value;
    }

    @Override
    public Integer get() {
        return value;
    }

    public static void main(String[] args) {
        Container<Integer> container = new IntegerContainer();
        container.set(11);
        System.out.println(container.get());
    }
}
