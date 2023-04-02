package org.example.secretHandshake;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class HandshakeCalculatorTest {

    private final HandshakeCalculator handshakeCalculator = new HandshakeCalculator();

    @Test
    public void testThatInput9YieldsAWinkAndJump() {
        assertEquals(handshakeCalculator.calculateHandshake(9),new LinkedList<>(List.of(Signal.WINK, Signal.JUMP)));
    }

    @Test
    public void testAnInputThatYieldsTwoReversedActions() {
        assertEquals(handshakeCalculator.calculateHandshake(19), new LinkedList<>(List.of(Signal.DOUBLE_BLINK, Signal.WINK)));
    }


}