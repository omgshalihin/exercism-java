package org.example.carsAssemble;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarsAssembleTest {

    CarsAssemble carsAssemble = new CarsAssemble();

    @Test
    void speed6() {
        int speed = 6;
        assertEquals(carsAssemble.productionRatePerHour(speed), 1193.4);
        assertEquals(carsAssemble.workingItemsPerMinute(speed), 19);
    }

    @Test
    public void workingItemsPerMinuteForSpeedZero() {
        assertEquals(carsAssemble.workingItemsPerMinute(0), 0);
    }
}