package com.example.day10;

public class NonGenericPair {
    private Object first;
    private Object second;

    public NonGenericPair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    public static void main(String[] args) {
        NonGenericPair pair = new NonGenericPair("abc", 10);
        // first와 second가 Object이므로 형변환 필요
        String first = (String) pair.getFirst();
        int second = (int) pair.getSecond();
    }
}
