package org.example.carsAssemble;

import java.util.HashMap;
import java.util.Map;

public class CarsAssemble {

    // speed of 1 produce 221 cars
    // 1 to 4: 100% success rate.
    // 5 to 8: 90% success rate.
    // 9: 80% success rate.
    // 10: 77% success rate.

    Map<Integer, Double> successRates = new HashMap<>(Map.of(
            1, 1.0,
            2, 1.0,
            3, 1.0,
            4, 1.0,
            5, 0.9,
            6, 0.9,
            7, 0.9,
            8, 0.9,
            9, 0.8,
            10, 0.77
    ));

    final double carsProducedPerHourAtSpeed1 = 221.0;

    public double productionRatePerHour(int speed) {
        if (speed == 0) {
            return 0;
        }
        double successRate = successRates.get(speed);
        return Double.parseDouble(String.valueOf(speed)) * carsProducedPerHourAtSpeed1 * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        if (speed == 0) {
            return 0;
        }
        double successRate = successRates.get(speed);
        double carsProducedPerHourAtSpeed6 = Double.parseDouble(String.valueOf(speed)) * carsProducedPerHourAtSpeed1 * successRate;
        return (int) (Math.floor(carsProducedPerHourAtSpeed6 / 60.0));
    }

}
