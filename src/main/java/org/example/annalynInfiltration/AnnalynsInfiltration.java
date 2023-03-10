package org.example.annalynInfiltration;

import java.util.LinkedHashMap;
import java.util.Map;

class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        Map<String, Boolean> enemyState = new LinkedHashMap<>(Map.of(
                "knightIsAwake", knightIsAwake,
                "archerIsAwake", archerIsAwake,
                "prisonerIsAwake", prisonerIsAwake
        ));

        long numberOfEnemiesAwake = enemyState.values().stream()
                .filter(state -> state)
                .count();

        return numberOfEnemiesAwake > 0;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }
}

