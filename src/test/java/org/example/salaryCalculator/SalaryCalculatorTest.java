package org.example.salaryCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalaryCalculatorTest {

    private final SalaryCalculator calculator = new SalaryCalculator();

    @Test
    void regularSalary() {
        assertEquals(calculator.finalSalary(0,0), 1000.0);
    }
    @Test
    public void soldAboveThreshold() {
        assertEquals(calculator.finalSalary(0, 25), 1325.0);
    }
    @Test
    public void skippedBelowThreshold() {
        assertEquals(calculator.finalSalary(3, 0), 1000.0);
    }
    @Test
    public void skippedAboveThreshold() {
        assertEquals(calculator.finalSalary(7, 0), 850.0);
    }

}