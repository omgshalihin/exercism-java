package org.example.perfectNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NaturalNumberTest {
    @Test
    void testSmall6ShouldReturnPerfect() {
        assertEquals(Classification.PERFECT, new NaturalNumber(6).getClassification());
    }
    @Test
    void testSmall12ShouldReturnPerfect() {
        assertEquals(Classification.PERFECT, new NaturalNumber(12).getClassification());
    }

    @Test
    void testMedium28ShouldReturnPerfect() {
        assertEquals(Classification.PERFECT, new NaturalNumber(28).getClassification());
    }

}