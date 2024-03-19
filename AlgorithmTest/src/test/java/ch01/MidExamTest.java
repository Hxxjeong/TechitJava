package ch01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MidExamTest {

    @Test
    void findMid() {
        Assertions.assertEquals(5, MidExam.midFind(1, 7, 5));
        Assertions.assertEquals(3, MidExam.midFind(3, 3, 5));
    }
}
