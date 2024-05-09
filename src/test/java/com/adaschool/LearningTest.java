package com.adaschool;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LearningTest {

    @DisplayName("test Sum Is Greater Than Five")
    @Test
    void testSumIsGreaterThanFive() {
        var numbers = List.of(1, 2, 3);
        var result = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        assertTrue(result > 5);
        assertEquals(3, numbers.size());
    }

    @Test
    void groupTest() {
        int[] numbers = {0 , 1, 2, 3};

        assertAll(
                "numbers",
                () -> assertEquals(numbers[0], 0),
                () -> assertEquals(numbers[2], 2)
        );
    }
}
