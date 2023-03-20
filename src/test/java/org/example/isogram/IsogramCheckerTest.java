package org.example.isogram;

import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.jupiter.api.Assertions.*;

class IsogramCheckerTest {

    IsogramChecker isogramChecker = new IsogramChecker();

    @Before
    public void setUp() {
        isogramChecker = new IsogramChecker();
    }
    @Test
    public void testEmptyString() {
        assertTrue(isogramChecker.isIsogram(""));
    }
    @Ignore("Remove to run test")
    @Test
    public void testLowercaseIsogram() {
        assertTrue(isogramChecker.isIsogram("isogram"));
    }
    @Ignore("Remove to run test")
    @Test
    public void testNotIsogram() {
        assertFalse(isogramChecker.isIsogram("eleven"));
    }
    @Ignore("Remove to run test")
    @Test
    public void testDuplicateEndAlphabet() {
        assertFalse(isogramChecker.isIsogram("zzyzx"));
    }
    @Ignore("Remove to run test")
    @Test
    public void testMediumLongIsogram() {
        assertTrue(isogramChecker.isIsogram("subdermatoglyphic"));
    }
    @Ignore("Remove to run test")
    @Test
    public void testCaseInsensitive() {
        assertFalse(isogramChecker.isIsogram("Alphabet"));
    }
    @Ignore("Remove to run test")
    @Test
    public void testDuplicatMixedCase() {
        assertFalse(isogramChecker.isIsogram("alphAbet"));
    }
    @Ignore("Remove to run test")
    @Test
    public void testIsogramWithHyphen() {
        assertTrue(isogramChecker.isIsogram("thumbscrew-japingly"));
    }
    @Ignore("Remove to run test")
    @Test
    public void testIsogramWithDuplicatedCharAfterHyphen() {
        assertFalse(isogramChecker.isIsogram("thumbscrew-jappingly"));
    }
    @Ignore("Remove to run test")
    @Test
    public void testIsogramWithDuplicatedHyphen() {
        assertTrue(isogramChecker.isIsogram("six-year-old"));
    }
    @Ignore("Remove to run test")
    @Test
    public void testMadeUpNameThatIsAnIsogram() {
        assertTrue(isogramChecker.isIsogram("Emily Jung Schwartzkopf"));
    }
    @Ignore("Remove to run test")
    @Test
    public void testDuplicatedCharacterInTheMiddleIsNotIsogram() {
        assertFalse(isogramChecker.isIsogram("accentor"));
    }
    @Ignore("Remove to run test")
    @Test
    public void testSameFirstAndLast() {
        assertFalse(new IsogramChecker().isIsogram("angola"));
    }

}