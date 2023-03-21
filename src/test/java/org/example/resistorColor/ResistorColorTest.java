package org.example.resistorColor;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResistorColorTest {

    private ResistorColor resistorColor;
    @Before
    public void setup() {
        resistorColor = new ResistorColor();
    }
    @Test
    public void testBlackColorCode() {
        assertEquals(resistorColor.colorCode("black"), 0);
    }
    @Ignore("Remove to run test")
    @Test
    public void testWhiteColorCode() {
        assertEquals(resistorColor.colorCode("white"), 9);
    }
    @Ignore("Remove to run test")
    @Test
    public void testOrangeColorCode() {
        assertEquals(resistorColor.colorCode("orange"), 3);
    }
    @Ignore("Remove to run test")
    @Test
    public void testColors() {
        assertEquals(resistorColor.colors(), new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"});
    }
}