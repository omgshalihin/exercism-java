package org.example.twelveDays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwelveDaysTest {

    private TwelveDays twelveDays;

    @BeforeEach
    public void setup() {
         this.twelveDays = new TwelveDays();
    }

    @Test
    public void testVerseOne() {
        String expectedVerseOne = "On the first day of Christmas my true love gave to me: " +
                "a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseOne, twelveDays.verse(1));
    }


}