package org.example.luhn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LuhnValidatorTest {

    LuhnValidator luhnValidator = new LuhnValidator();

    @Test
    public void testSingleDigitStringInvalid() {
        assertFalse(luhnValidator.isValid("1"));
    }
    @Test
    public void testSingleZeroIsInvalid() {
        assertFalse(luhnValidator.isValid("0"));
    }
    @Test
    public void testSimpleValidSINReversedRemainsValid() {
        assertTrue(luhnValidator.isValid("059"));
    }
    @Test
    public void testSimpleValidSINReversedBecomesInvalid() {
        assertTrue(luhnValidator.isValid("59"));
    }
    @Test
    public void givenValidExample() {
        assertTrue(luhnValidator.isValid("4539 3195 0343 6467"));
    }
    @Test
    public void givenInvalidExample() {
        assertFalse(luhnValidator.isValid("8273 1232 7352 0569"));
    }
    @Test
    public void testValidCanadianSINValid() {
        assertTrue(luhnValidator.isValid("055 444 285"));
    }
    @Test
    public void testStringContainingPunctuationInvalid() {
        assertFalse(luhnValidator.isValid("055-444-285"));
    }
    @Test
    public void testUsingASCIIValueForNonDoubledNonDigitNotAllowed() {
        assertFalse(luhnValidator.isValid("055b 444 285"));
    }
    @Test
    public void testStringContainingSymbolsInvalidJavaTrackSpecific() {
        assertFalse(luhnValidator.isValid("85&"));
    }

}




