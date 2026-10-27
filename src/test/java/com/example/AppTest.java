
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private final App app = new App();

    @Test
    void testAddition() {
        assertEquals(15, app.add(10, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, app.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50, app.multiply(10, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, app.divide(10, 5), 0.001);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> app.divide(10, 0)
        );
    }

    @Test
    void testEvenNumber() {
        assertTrue(app.isEven(10));
    }

    @Test
    void testOddNumber() {
        assertFalse(app.isEven(7));
    }
}
