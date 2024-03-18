package com.exam;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    void subString() {
        String str = "abcde";
        // substring(int start, int end): start부터 end-1까지
        assertEquals("cd", str.substring(2, 4));
    }
}
