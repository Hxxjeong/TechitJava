package com.example.day10;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<String> strBox = new Box<>("hello");
        String value = strBox.getValue();

        Pair<String, Box<Integer>> pair = new Pair<>("hello", new Box<>(10));
    }
}
