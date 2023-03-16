package org.example.blackjack;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Blackjack {

    Map<String, Integer> cardValueMap = new LinkedHashMap<>(Map.ofEntries(
            Map.entry("ace", 11),
            Map.entry("two", 2),
            Map.entry("three", 3),
            Map.entry("four", 4),
            Map.entry("five", 5),
            Map.entry("six", 6),
            Map.entry("seven", 7),
            Map.entry("eight", 8),
            Map.entry("nine", 9),
            Map.entry("ten", 10),
            Map.entry("jack", 10),
            Map.entry("queen", 10),
            Map.entry("king", 10),
            Map.entry("other", 0)
    ));


    public int parseCard(String card) {
        return cardValueMap.get(card);
    }

    public boolean isBlackjack(String card1, String card2) {
        return (cardValueMap.get(card1) + cardValueMap.get(card2) == 21);
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack && dealerScore < 10) {
            return "W";
        } else if (isBlackjack && dealerScore >= 10) {
            return "S";
        } else {
            return "P";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else {
            return dealerScore >= 7 ? "H" : "S";
        }
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (handScore > 20) {
            System.out.println("here 1");
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            System.out.println("here 2");
            return smallHand(handScore, dealerScore);
        }
    }
}

