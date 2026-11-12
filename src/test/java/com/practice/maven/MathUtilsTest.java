package com.practice.maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilsTest {
    @Test
    void addsTwoNumbers() {
        assertEquals(16, MathUtils.add(5, 10));
    }
}
