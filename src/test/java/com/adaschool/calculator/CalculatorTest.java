package com.adaschool.calculator;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void oneSumByTwoEqualsThree() {
        int result = calculator.add(1, 2);


        assertEquals(3, result);
    }

    @Test
    void whenSecondParameterIsDifferentToZeroThenSuccess() throws Exception {
        int a = 20;
        int b = 2;

        assumeTrue(b > 0);

        int result = calculator.divide(a, b);
        assertEquals(a / b, result);
    }

    @Test
    void whenSecondParameterIsZeroThenFailed() {
        assertThrows(Exception.class, () -> calculator.divide(1, 0));
    }
}