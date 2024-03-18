package com.exam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    void plus() {
        assertEquals(5, cal.plus(2, 3));
        assertEquals(10, cal.plus(3, 7));
    }

    @Test
    void minus() {
        assertEquals(7, cal.minus(14, 7));
        assertEquals(2, cal.minus(5, 3));
    }
    
    @BeforeAll
    static void beforeAll() {
        System.out.println("Test Class가 실행될 때 한 번 실행됨");
    }
    
    @BeforeEach
    void beforeEach() {
        System.out.println("Test Class가 실행 될 때마다 실행됨");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("각 테스트가 모두 종료된 후 실행");
    }

    @AfterEach
    void afterEach() {
        System.out.println("각 테스트 메소드가 실행된 후 실행됨");
    }
}