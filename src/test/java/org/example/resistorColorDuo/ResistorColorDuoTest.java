package org.example.resistorColorDuo;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResistorColorDuoTest {

    ResistorColorDuo resistorColorDuo = new ResistorColorDuo();
    @Before
    public void setup() {
        resistorColorDuo = new ResistorColorDuo();
    }
    @Test
    public void testBrownAndBlack() {
        assertEquals(resistorColorDuo.value(new String[]{"brown", "black"}), 10);
    }
    @Ignore("Remove to run test")
    @Test
    public void testBlueAndGrey() {
        assertEquals(
                resistorColorDuo.value(new String[]{ "blue", "grey" }),68);
    }
    @Ignore("Remove to run test")
    @Test
    public void testYellowAndViolet() {
        assertEquals(resistorColorDuo.value(new String[]{ "yellow", "violet" }),47
        );
    }
    @Ignore("Remove to run test")
    @Test
    public void testOrangeAndOrange() {
        assertEquals(resistorColorDuo.value(new String[]{ "orange", "orange" }), 33);
    }
    @Ignore("Remove to run test")
    @Test
    public void testIgnoreAdditionalColors() {
        assertEquals(resistorColorDuo.value(new String[]{ "green", "brown", "orange" }), 51);
    }

}