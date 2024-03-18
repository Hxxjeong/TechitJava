package com.exam;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateCalculatorTest {

    private DateCalculator dateCalculator;

    @BeforeEach
    void setUp() {
        dateCalculator = new DateCalculator();
    }

    @Test
    void calculateAge() {
        LocalDate birthDate = LocalDate.of(2000, 2, 14);
        LocalDate currentDate = LocalDate.of(2024, 3, 18);

        assertEquals(24, dateCalculator.calculateAge(birthDate, currentDate));
    }

    @Test
    void calculateDaysBetween() {
        LocalDate startDate = LocalDate.of(2022, 2, 15);
        LocalDate endDate = LocalDate.of(2022, 3, 1);
        assertEquals(14, dateCalculator.calculateDaysBetween(startDate, endDate));
    }

    @Test
    void testIsLeapYear() {
        assertEquals(true, dateCalculator.isLeapYear(2024));
    }
}
