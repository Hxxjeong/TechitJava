package ch01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class maxValueTest {
    @Test
    void max() {
        Assertions.assertEquals(5, MaxValue.max(1, 2, 5));
        Assertions.assertEquals(7, MaxValue.max(3, 7, 5));
        Assertions.assertEquals(11, MaxValue.max(11, 6, 4));
        Assertions.assertEquals(1, MaxValue.max(1, 1, 1));
    }
}
