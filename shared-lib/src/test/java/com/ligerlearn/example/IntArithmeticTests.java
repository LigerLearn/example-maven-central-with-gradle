package com.ligerlearn.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntArithmeticTests {

    @ParameterizedTest
    @CsvSource({"10,12", "12,67", "2134,124"})
    void add(int a, int b) {
        var result = new IntArithmetic().add(a, b);
        assertEquals(a + b, result);
    }

    @ParameterizedTest
    @CsvSource({"10,12", "12,67", "2134,124"})
    void subtract(int a, int b) {
        var result = new IntArithmetic().subtract(a, b);
        assertEquals(a - b, result);
    }

    @ParameterizedTest
    @CsvSource({"10,12", "12,67", "2134,124"})
    void multiply(int a, int b) {
        var result = new IntArithmetic().multiply(a, b);
        assertEquals(a * b, result);
    }

    @ParameterizedTest
    @CsvSource({"10,12", "12,67", "2134,124"})
    void divide(int a, int b) {
        var result = new IntArithmetic().divide(a, b);
        assertEquals(a / b, result);
    }

}
