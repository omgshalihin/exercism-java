package org.example.annalynInfiltration;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnnalynsInfiltrationTest {

    @Test
    void can_execute_fast_attack_if_knight_is_sleeping() {
        boolean knightIsAwake = false;
        assertEquals(AnnalynsInfiltration.canFastAttack(knightIsAwake), true);
    }

    @Test
    void cannot_execute_fast_attack_if_knight_is_awake() {
        boolean knightIsAwake = true;
        assertEquals(AnnalynsInfiltration.canFastAttack(knightIsAwake), false);
    }

    @Test
    void can_spy_if_only_knightIsAwake() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        assertEquals(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake), true);
    }
    @Test
    void can_spy_if_only_archerIsAwake() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        assertEquals(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake), true);
    }
    @Test
    void can_spy_if_only_prisonerIsAwake() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        assertEquals(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake), true);
    }
    @Test
    void can_spy_if_allIsAwake() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        assertEquals(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake), true);
    }
    @Test
    void cannot_spy_if_noneIsAwake() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        assertEquals(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake), false);
    }

    @Test
    void can_signal_prisoner_if_only_prisonerIsAwake() {
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        assertTrue(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }
    @Test
    void cannot_signal_prisoner_if_archerIsAwake() {
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }
    @Test
    void cannot_signal_prisoner_if_bothAwake() {
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }
    @Test
    void cannot_signal_prisoner_if_bothAsleep() {
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }
}