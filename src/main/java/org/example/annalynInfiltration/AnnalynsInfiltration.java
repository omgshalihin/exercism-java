package org.example.annalynInfiltration;

import java.util.LinkedHashMap;
import java.util.Map;

class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        Map<String, Boolean> stateMap = new LinkedHashMap<>(Map.of(
                "knightIsAwake", knightIsAwake,
                "archerIsAwake", archerIsAwake,
                "prisonerIsAwake", prisonerIsAwake
        ));

        long countAwake = stateMap.values().stream()
                .filter(state -> state)
                .count();

        return countAwake > 0;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        Map<String, Boolean> stateMap = new LinkedHashMap<>(Map.of(
                "archerIsAwake", archerIsAwake,
                "prisonerIsAwake", prisonerIsAwake
        ));

        long ifPrisonerIsAwake = stateMap.entrySet().stream()
                .filter(character -> character.getKey().equals("prisonerIsAwake"))
                .filter(Map.Entry::getValue)
                .count();

        long ifArcherIsAsleep = stateMap.entrySet().stream()
                .filter(character -> character.getKey().equals("archerIsAwake"))
                .filter(Map.Entry::getValue)
                .count();

        return ifPrisonerIsAwake == 1 && ifArcherIsAsleep == 0;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (!knightIsAwake && !archerIsAwake && prisonerIsAwake) || (!archerIsAwake && petDogIsPresent);
    }
}

