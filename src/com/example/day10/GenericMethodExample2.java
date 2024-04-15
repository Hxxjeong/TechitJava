package com.example.day10;

public class GenericMethodExample2 {
    // 상한 사용 (extends), Number의 자식 타입 가능
    public static <T extends Number> T max(T x, T y, T z) {
        T max = x;
        
        if(y.doubleValue() > max.doubleValue()) // Number의 메소드
            max = y;
        if(z.doubleValue() > max.doubleValue())
            max = z;
        return max;
    }

    public static void main(String[] args) {
        Number max = max(1.2, 35, 4.33);
        System.out.println(max);
    }
}
