package org.example.salaryCalculator;

public class SalaryCalculator {

    private static final double BASE_SALARY = 1000.00;
    public double multiplierPerDaysSkipped(int daysSkipped) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.multiplierPerDaysSkipped() method");
    }

    public int multiplierPerProductsSold(int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.multiplierPerProductsSold() method");
    }

    public double bonusForProductSold(int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductSold() method");
    }

    public double finalSalary(int daysSkipped, int productsSold) {

        return daysSkipped == 0 && productsSold == 0 ? BASE_SALARY : 0;
    }
}
