package org.example.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackjackTest {

    Blackjack blackjack = new Blackjack();

    @Test
    public void value_ace_11() {
        String card = "ace";
        assertEquals(blackjack.parseCard(card), 11);
    }


    @Test
    public void blackjackWithKingAceSecond() {
        assertTrue(blackjack.isBlackjack("king", "ace"));
    }

    @Test
    public void firstTurnWithAceAceAndDealerAce() {
        assertEquals(blackjack.firstTurn("ace", "ace", "ace"), "P");
    }

}