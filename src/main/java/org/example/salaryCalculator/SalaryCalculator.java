package org.example.salaryCalculator;

public class SalaryCalculator {

    private static final double BASE_SALARY = 1000.00;
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped > 5 ? 15 : 0;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        int monetaryUnitMultiplier = multiplierPerProductsSold(productsSold);
        return monetaryUnitMultiplier * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double penaltyMultiplier = multiplierPerDaysSkipped(daysSkipped);
        double totalBonus = bonusForProductSold(productsSold);
        double finalSalary = BASE_SALARY * ((100 - penaltyMultiplier) / 100) + totalBonus;

        return daysSkipped == 0 && productsSold == 0 ? BASE_SALARY : Math.min(finalSalary, 2000.0);
    }
}
