package com.example.day10;

// 가상의 타입 설정
public class GenericPair<T1, T2> {
    private T1 first;
    private T2 second;

    public GenericPair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public static void main(String[] args) {
        GenericPair<String, Integer> pair = new GenericPair<>("abc", 20);
        // Generic 사용 시 형변환 X
        pair.getFirst();
        pair.getSecond();
    }
}
