package com.example.day16;

import java.util.function.*;

public class LambdaExam3 {
    public static void main(String[] args) {
        // Predicate<입력 타입>
        // 조건을 테스트하는 데 사용 (return boolean)
        Predicate<Integer> isPositive = (x -> x > 0);

        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-5));

        // Consumer<입력 타입>
        // 입력 하나를 받아 반환이 없는 연산 수행
        Consumer<String> printer = (s -> System.out.println(s));
        printer.accept("hello");

        // andThen (Consumer가 하는 일을 연달아 수행)
        Consumer<String> conA = s -> System.out.println(s + "aaaa");
        Consumer<String> conB = s -> System.out.println(s + "bbbb");
        conA.andThen(conB).accept("hi ");

        // Function<입력 타입, 반환 타입>
        // 입력을 받아 출력 반환
        Function<String, Integer> length = (s -> s.length());
        System.out.println(length.apply("Function Interface"));

        // Supplier<반환 타입>
        // 입력 없이 값 반환
        Supplier<Double> random = (() -> Math.random());
        System.out.println(random.get());

        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(intSupplier.getAsInt());

        // UnaryOperator<입력/반환 타입>
        // 입력과 출력이 같은 타입
        UnaryOperator<Integer> square = (x -> x * x);
        System.out.println(square.apply(5));

        // BiFunction
        // 두 개의 입력을 받아 하나의 값 반환
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(4, 9));
    }
}
